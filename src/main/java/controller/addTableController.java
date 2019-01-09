package controller;

import domain.Table;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;
import service.tableService;

@WebServlet(name = "addTableController")
public class addTableController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("11111");

        request.setCharacterEncoding("UTF-8");

        //1.获取数据
        Map<String,String[]> data = request.getParameterMap();

        System.out.println("data="+data.values());

        //2.封装数据
        Table table = new Table();
        try {
            BeanUtils.populate(table, data);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //此位置Table已经封装完毕----将表单的数据封装完毕

        //3.传递数据给service层
        tableService service = new tableService();
        try {
            service.addTable(table);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        //跳转到列表页面
        response.sendRedirect("/listTableController");

    }
}

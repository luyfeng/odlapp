package controller;

import domain.Table;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.Map;
import service.tableService;

@WebServlet(name = "updateTableController")
public class updateTableController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("updateTableController---------------");

        request.setCharacterEncoding("UTF-8");

        //1.获取数据
        Map<String,String[]> data = request.getParameterMap();
        //2.封装数据
        Table table = new Table();
        try {
            BeanUtils.populate(table,data);
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

        //此位置Table已经封装完毕------将表单的数据封装完毕
        //如果有需要的数据 表单中没有，在下面手动设置

        tableService service = new tableService();
        try {
            service.updateTable(table);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        //跳转到列表页面
        response.sendRedirect("listTableController");

    }
}

package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import domain.Table;
import service.tableService;

@WebServlet(name = "listTableController")
public class listTableController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("llllllistTableController");

        request.setCharacterEncoding("UTF-8");

        //传递请求到service层
        tableService service = new tableService();
        List<Table> tableList = null;
        try {
            tableList = service.findAllTable();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("ccccccontroller---lllllllllllisttable="+tableList);

        //将tableList放到request域
        request.setAttribute("tableList",tableList);

        request.getRequestDispatcher("index.jsp").forward(request,response);

    }
}

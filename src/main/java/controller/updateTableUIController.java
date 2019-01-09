package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

import domain.Table;
import service.tableService;

@WebServlet(name = "updateTableUIController")
public class updateTableUIController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("updateTableUIController");

        //获取要查询Table的id
        String id = request.getParameter("id");
        //传递id查询flowtb信息
        tableService service = new tableService();
        Table table = null;
        try {
            table = service.findTableById(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("updateTableUIController----table="+table);

        request.setAttribute("table", table);

        request.getRequestDispatcher("/updateflowtb.jsp").forward(request,response);


    }
}

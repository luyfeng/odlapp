package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

import service.tableService;

@WebServlet(name = "delTableController")
public class delTableController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        //获取要删除的id
        String id = request.getParameter("id");

        //传递id到service层
        tableService service = new tableService();
        try {
            service.delTableById(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        response.sendRedirect("/listTableController");

    }
}

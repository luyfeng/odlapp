package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
//import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import service.loginService;
import sun.security.krb5.internal.PAData;

@WebServlet(name = "loginCheckController")
public class loginCheckController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=utf-8");

        HttpSession session = request.getSession();

        //获得用户名和密码
        String admin = request.getParameter("admin");
        String password = request.getParameter("password");

        System.out.println("33333"+admin);
        System.out.println("444444"+ password);

        loginService service = new loginService();
        boolean isExist = service.checkAdmin(admin,password);



            if (isExist==true){
                response.sendRedirect("/index.jsp");
            }else {
                response.sendRedirect("/login.jsp");
            }



    }
}

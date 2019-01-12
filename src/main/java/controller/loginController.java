package controller;

import domain.Admin;
import service.loginService;

//import javax.servlet.http.Cookie;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

public class loginController extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
            throws javax.servlet.ServletException, IOException {
        doGet(request,response);

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
            throws javax.servlet.ServletException, IOException {
//        HttpSession session = request.getSession();

        //获得输入的管理员和密码
        String admin = request.getParameter("admin");
        String password = request.getParameter("password");

        System.out.println("admin="+admin);
        System.out.println("password="+password);



        //将管理员和密码传递给service层
        loginService service = new loginService();
        Admin message = null;
        try {
            message = service.login(admin,password);
            System.out.println("999999999message===="+message);
        } catch (SQLException e) {
            e.printStackTrace();
        }


        //判断用户是否登录成功 user是否是null
        if(message!=null){


            //重定向到首页
            response.sendRedirect("/listTableController");
        }else{
//            request.setAttribute("loginError", "用户名或密码错误");
//            request.getRequestDispatcher("/login.jsp").forward(request, response);
            response.getWriter().write("sorry you press admin or password is ...");
        }
    }


    }

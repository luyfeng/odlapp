package service;

import domain.Admin;
import dao.loginDao;

import java.sql.SQLException;

public class loginService {

    //验证管理员
    public boolean checkAdmin(String admin,String password) {
        loginDao dao = new loginDao();
        Long isExist = 0L;
        try {
            isExist = dao.checkAmin(admin,password);
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return isExist > 0 ? true : false;
    }

    //管理员登录的方法
    public Admin login(String admin, String password) throws SQLException {

        System.out.println("sssssssssssserice");

        loginDao dao = new loginDao();
        return dao.login(admin,password);

    }
}

package dao;

import domain.Admin;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import utils.dataSourceUtils;

import java.sql.SQLException;

public class loginDao {



    //校验管理员是否存在
    public Long checkAmin(String admin, String password) throws SQLException {
        QueryRunner runner = new QueryRunner(dataSourceUtils.getDataSource());
        String sql = "select count(*) from admin where admin = ? and password = ?";
        Long query = (Long) runner.query(sql, new ScalarHandler(), admin,password);
        return query;
    }


    //用户登录的方法
    public Admin login(String admin, String password) throws SQLException {

        System.out.println("dddddddddddddddddao");

        QueryRunner runner = new QueryRunner(dataSourceUtils.getDataSource());
        String sql = "select * from admin where admin=? and password=?";
        return runner.query(sql, new BeanHandler<Admin>(Admin.class), admin,password);
    }
}

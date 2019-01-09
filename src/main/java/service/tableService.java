package service;

import domain.Table;
import dao.tableDao;

import java.sql.SQLException;
import java.util.List;

public class  tableService {

    //添加数据
    public void addTable(Table table) throws SQLException {

        System.out.println("添加数据tttttablesssservice");

        tableDao dao = new tableDao();
        dao.addTable(table);
    }

    //查询所有数据
    public List<Table> findAllTable() throws SQLException {
        //如果没有复杂的业务 直接传递请求到dao层
        tableDao dao = new tableDao();
        return dao.findAllTable();
    }

    //根据id删除数据
    public void delTableById(String id) throws SQLException {
        tableDao dao = new tableDao();
        dao.delTableById(id);
    }

    //更新flowtb数据
    public void updateTable(Table table) throws SQLException {
        tableDao dao = new tableDao();
        dao.updateTable(table);
    }

    //根据id查询数据
    public Table findTableById(String id) throws SQLException {
        tableDao dao = new tableDao();
        return dao.findTableById(id);
    }
}

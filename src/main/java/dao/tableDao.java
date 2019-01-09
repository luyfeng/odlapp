package dao;

import domain.Table;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import utils.dataSourceUtils;

import java.sql.SQLException;
import java.util.List;

public class tableDao {

    //存入数据
    public void addTable(Table table) throws SQLException {

        System.out.println("tttttabelddddddddao");

        QueryRunner runner = new QueryRunner(dataSourceUtils.getDataSource());
        System.out.println("tttttttablesqqqqql=");
        String sql = "insert into flowtb values(?,?,?,?,?,?,?,?,?,?)";
        runner.update(sql, table.getId(), table.getPriority(), table.getTable_id(), table.getHard_timeout(),
                table.getIdle_timeout(), table.getFlow_name(), table.getIn_port(),table.getInstruction_order(),
                table.getAction_order(), table.getOutput_node_connector());
    }

    //查询所有数据
    public List<Table> findAllTable() throws SQLException {
        QueryRunner runner = new QueryRunner(dataSourceUtils.getDataSource());
        String sql = "select * from flowtb";
        List<Table> tableList = runner.query(sql, new BeanListHandler<Table>(Table.class));
        System.out.println("dddddlllllllllllisttable="+tableList);
        return tableList;
    }

    //根据id删除数据
    public void delTableById(String id) throws SQLException {
        QueryRunner runner = new QueryRunner(dataSourceUtils.getDataSource());
        String sql = "delete from flowtb where id = ?";
        runner.update(sql,id);
    }

    //更新flowtb数据
    public void updateTable(Table table) throws SQLException {
        QueryRunner runner = new QueryRunner(dataSourceUtils.getDataSource());
        String sql = "update flowtb set priority=?,table_id=?,hard_timeout=?,idle_timeout=?," +
                "flow_name=?,in_port=?,instruction_order=?,action_order=?,output_node_connector=? where id=?";
        runner.update(sql,table.getPriority(), table.getTable_id(), table.getHard_timeout(),
                table.getIdle_timeout(), table.getFlow_name(), table.getIn_port(),table.getInstruction_order(),
                table.getAction_order(), table.getOutput_node_connector(), table.getId());
    }

    //根据id查询数据
    public Table findTableById(String id) throws SQLException {
        QueryRunner runner = new QueryRunner(dataSourceUtils.getDataSource());
        String sql = "select * from flowtb where id=?";
        Table table = runner.query(sql, new BeanHandler<Table>(Table.class), id);
        return table;
    }

}

package dao;

import domain.NodeConnector.NodeConnectorRootBean;
import domain.Nodes.NodeBean;
import domain.Nodes.NodeConnectorBean;
import domain.Nodes.NodesBean;
import domain.Nodes.NodesRootBean;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import utils.dataSourceUtils;
import domain.listNodeConnectorBean;

import java.sql.SQLException;
import java.util.List;

public class NodeConnectorDao {

    //存入数据
//    public void addNodeConnector(NodeConnectorRootBean nodeConnectorRootBean) throws SQLException {
//
//        QueryRunner runner = new QueryRunner(dataSourceUtils.getDataSource());
//        String sql = "insert into nodeconnector values(?,?,?,?,?,?)";
//
//        List<NodeConnectorBean> nodeConnectorBeanList = nodeConnectorRootBean.getNodeConnector();
//
//        for ( NodeConnectorBean nodeConnectorBean :  nodeConnectorBeanList){
//            runner.update(sql, nodeConnectorBean.getId(), nodeConnectorBean.getFlowNodeInventory_PortNumber(),
//                    nodeConnectorBean.getFlowNodeInventory_HardwareAddress(), nodeConnectorBean.getFlowNodeInventory_CurrentSpeed(),
//                    nodeConnectorBean.getFlowNodeInventory_Name(), nodeConnectorBean.getFlowNodeInventory_State().isLive());
//        }
//    }

    //存入数据
    public void addNodes(NodesRootBean nodesRootBean) throws SQLException {
        QueryRunner runner = new QueryRunner(dataSourceUtils.getDataSource());
        String sql = "insert into nodeconnector values(?,?,?,?,?,?)";

        NodesBean nodesBean = nodesRootBean.getNodes();
        List<NodeBean> nodeBeanList = nodesBean.getNode();
        System.out.println("dao----nodeBeanList="+nodeBeanList);

        for (NodeBean nodeBean : nodeBeanList) {
            List<domain.Nodes.NodeConnectorBean> nodeConnectorBeanList = nodeBean.getNodeConnector();
            System.out.println("dao---nodeConnectorBeanList="+nodeConnectorBeanList);
            for (domain.Nodes.NodeConnectorBean nodeConnectorBean : nodeConnectorBeanList){
                String hardwareAddress = nodeConnectorBean.getFlowNodeInventory_HardwareAddress();
                System.out.println("dao---hardwareAddress="+hardwareAddress);
                runner.update(sql, nodeConnectorBean.getId(), nodeConnectorBean.getFlowNodeInventory_PortNumber(),
                    nodeConnectorBean.getFlowNodeInventory_HardwareAddress(), nodeConnectorBean.getFlowNodeInventory_CurrentSpeed(),
                    nodeConnectorBean.getFlowNodeInventory_Name(), nodeConnectorBean.getFlowNodeInventory_State().isLive());
            }
        }
    }

    //取出数据
    public List<listNodeConnectorBean> findAllNodeConnector() throws SQLException {
        QueryRunner runner = new QueryRunner(dataSourceUtils.getDataSource());
        String sql = "select * from nodeconnector";
        List<listNodeConnectorBean> nodeConnectorBeanList = runner.query(sql, new BeanListHandler<listNodeConnectorBean>(listNodeConnectorBean.class));
        System.out.println("dao-----nodeConnectorBeanList="+nodeConnectorBeanList);
        return nodeConnectorBeanList;
    }




}

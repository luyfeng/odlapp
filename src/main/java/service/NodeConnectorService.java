package service;

import dao.NodeConnectorDao;
import domain.NodeConnector.NodeConnectorRootBean;
import domain.Nodes.NodeConnectorBean;
import domain.Nodes.NodesRootBean;
import domain.listNodeConnectorBean;

import java.sql.SQLException;
import java.util.List;

public class NodeConnectorService {

    //存入数据
    public void addNodes(NodesRootBean nodesRootBean) throws SQLException {

        NodeConnectorDao dao = new NodeConnectorDao();
        dao.addNodes(nodesRootBean);

    }
    //取出数据
    public List<listNodeConnectorBean> findAllNodeConnector() throws SQLException {
        NodeConnectorDao dao = new NodeConnectorDao();
        return dao.findAllNodeConnector();
    }

}

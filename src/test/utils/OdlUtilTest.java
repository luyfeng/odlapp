package utils;

import com.google.gson.Gson;
import domain.NodeConnector.FlowNodeInventory_StateBean;
import domain.NodeConnector.NodeConnectorBean;
import domain.NodeConnector.NodeConnectorRootBean;
import domain.Nodes.NodeBean;
import domain.Nodes.NodesBean;
import domain.Nodes.NodesRootBean;
import domain.TestBean;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OdlUtilTest {

    @Test
    void getNodes() {

        OdlUtil odlUtil = new OdlUtil("10.1.2.1",8181);
        String str = odlUtil.getNodes();
        System.out.println(str);

        //gson把json解析成javabean
        Gson gson = new Gson();
        NodesRootBean nodesRootBean = gson.fromJson(str,NodesRootBean.class);
        System.out.println("nodesRootBean="+nodesRootBean);

        NodesBean nodesBean = nodesRootBean.getNodes();
        List<NodeBean> nodeBeanList = nodesBean.getNode();
        System.out.println("nodeBeanList="+nodeBeanList);

        for (NodeBean nodeBean : nodeBeanList) {
            List<domain.Nodes.NodeConnectorBean> nodeConnectorBeanList = nodeBean.getNodeConnector();
            System.out.println("nodeConnectorBeanList="+nodeConnectorBeanList);
            for (domain.Nodes.NodeConnectorBean nodeConnectorBean : nodeConnectorBeanList){
                String hardwareAddress = nodeConnectorBean.getFlowNodeInventory_HardwareAddress();
                System.out.println("hardwareAddress="+hardwareAddress);
            }
        }

//        String nodeConnectorBeanList = nodesRootBean.getNodes().getNode().get(0).getNodeConnector().get(0).getFlowNodeInventory_HardwareAddress();




    }

    @Test
    void getNode_Connector() {

//        System.out.println(Base64.getEncoder().encodeToString(("admin" + ":" + "admin").getBytes()));
        OdlUtil odlUtil = new OdlUtil("10.1.2.1",8181);
        String str  = null;
        str = odlUtil.getNode_Connector();

        Gson gson = new Gson();
//        String json = gson.toJson(str);
//
//        System.out.println(json);

//        NodeConnectorRootBean nodeConnectorRootBean = gson.fromJson(json,NodeConnectorRootBean.class);
        NodeConnectorRootBean nodeConnectorRootBean = gson.fromJson(str,NodeConnectorRootBean.class);

        List<NodeConnectorBean> nodeConnectorBeanList = nodeConnectorRootBean.getNodeConnector();

//        String nodeConnectorBean = nodeConnectorBeanList.get(0).getFlowNodeInventory_HardwareAddress();
//
        for ( NodeConnectorBean nodeConnectorBean :  nodeConnectorBeanList){
            boolean FlowNodeInventory_HardwareAddress = nodeConnectorBean.getFlowNodeInventory_State().isLive();
            String a = nodeConnectorBean.getFlowNodeInventory_HardwareAddress();
            System.out.println(FlowNodeInventory_HardwareAddress);
            System.out.println(a);
        }

        String json = gson.toJson(nodeConnectorRootBean);


//        String FlowNodeInventory_HardwareAddress = nodeConnectorRootBean;
//        List<NodeConnectorRootBean> list = nodeConne ctorRootBean;

//        System.out.println(nodeConnectorRootBean);
//        System.out.println(nodeConnectorBean);

    }

    @Test
    void test() {

//        String jsonStr = "{\"name\":\"1\",\"ag-e\":2,\"id\":0}";


        TestBean testBean = new TestBean();
        testBean.setAgE("19");
        testBean.setId("0");
        testBean.setName("lu");

        Gson gson = new Gson();
        String json = gson.toJson(testBean);
        System.out.println(json);

        TestBean lu = gson.fromJson(json,TestBean.class);

        String age = lu.AgE;

        System.out.println(age);



    }

}
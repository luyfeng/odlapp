package utils;

import com.google.gson.Gson;
import domain.NodeConnector.FlowNodeInventory_StateBean;
import domain.NodeConnector.NodeConnectorBean;
import domain.NodeConnector.NodeConnectorRootBean;
import domain.TestBean;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OdlUtilTest {

    @Test
    void getNode_Connector() {

//        System.out.println(Base64.getEncoder().encodeToString(("admin" + ":" + "admin").getBytes()));
        OdlUtil odlUtil = new OdlUtil("10.1.11.26",8181);
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
            String FlowNodeInventory_HardwareAddress = nodeConnectorBean.getFlowNodeInventory_PortNumber();
            System.out.println(FlowNodeInventory_HardwareAddress);
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
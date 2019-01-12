package controller.NodeConnector;

import com.google.gson.Gson;
import domain.NodeConnector.NodeConnectorBean;
import domain.NodeConnector.NodeConnectorRootBean;
import domain.Nodes.NodesRootBean;
import service.NodeConnectorService;
import utils.OdlUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "addNodeConnectorController")
public class addNodeConnectorController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        System.out.println("--------addNodeConnectorController--------");

//        System.out.println(Base64.getEncoder().encodeToString(("admin" + ":" + "admin").getBytes()));
        //调用OdlUtil类获取url的json数据（此时是字符串形式）
        OdlUtil odlUtil = new OdlUtil("10.1.2.1",8181);
        String str  = null;
        str = odlUtil.getNodes();

        Gson gson = new Gson();
//
        //用gson把json字符串转化成javabean实体，数据存到NodesRootBean类中
        NodesRootBean nodesRootBean = gson.fromJson(str,NodesRootBean.class);
        System.out.println("nodesRootBean="+nodesRootBean);


        //传递到service层
        NodeConnectorService service = new NodeConnectorService();
        try {
            service.addNodes(nodesRootBean);
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}

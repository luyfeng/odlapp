package controller.NodeConnector;

import domain.Nodes.NodeConnectorBean;
import domain.listNodeConnectorBean;
import service.NodeConnectorService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "listAllNodeConnectorController")
public class listAllNodeConnectorController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
//        System.out.println("llllllistTableController");
//
//        request.setCharacterEncoding("UTF-8");
//
//        //传递请求到service层
//        tableService service = new tableService();
//        List<Table> tableList = null;
//        try {
//            tableList = service.findAllTable();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("lllllllllllisttable="+tableList);
//
//        //将tableList放到request域
//        request.setAttribute("tableList",tableList);
//
//        request.getRequestDispatcher("index.jsp").forward(request,response);

        //传递请求到service层
        NodeConnectorService service = new NodeConnectorService();
        List<listNodeConnectorBean> nodeConnectorBeanList = null;
        try {
            nodeConnectorBeanList = service.findAllNodeConnector();
        } catch (SQLException e) {
            e.printStackTrace();
        }
//        System.out.println("cccccccontroller---nodeConnectorBeanList="+nodeConnectorBeanList.get(0).getFlowNodeInventory_HardwareAddress());
        System.out.println("cccccccontroller---nodeConnectorBeanList="+nodeConnectorBeanList);
//        System.out.println("cccccccontroller---nodeConnectorBeanList="+nodeConnectorBeanList);

        //将nodeConnectorBeanList放到request域
        request.setAttribute("nodeConnectorBeanList",nodeConnectorBeanList);
        request.getRequestDispatcher("nodeConnector.jsp").forward(request,response);

    }
}

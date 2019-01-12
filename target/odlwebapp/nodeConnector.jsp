<%--
  Created by IntelliJ IDEA.
  User: lu
  Date: 2019/1/12
  Time: 5:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false"%>
<html>
<head>
    <title>NodeConnector</title>
</head>
<body>


<div>
    <table style="border:1px solid">
        <thead>
        <tr >
            <th>id</th>
            <th>FlowNodeInventory_PortNumber</th>
            <th>FlowNodeInventory_HardwareAddress</th>
            <th>FlowNodeInventory_CurrentSpeed</th>
            <th>FlowNodeInventory_Name</th>
            <th>FlowNodeInventory_State</th>
            <th>operate</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${nodeConnectorBeanList }" var="node">
            <tr>
                <td>${node.id}</td>
                <td>${node.FlowNodeInventory_PortNumber}</td>
                <td>${node.FlowNodeInventory_HardwareAddress}</td>
                <td>${node.FlowNodeInventory_CurrentSpeed}</td>
                <td>${node.FlowNodeInventory_Name}</td>
                <td>${node.FlowNodeInventory_State.live}</td>
                <td>
                        <%--<a href="#" onclick="editCustomer(${})">修改</a>--%>
                        <%--<a href="#" onclick="deleteCustomer(${})">删除</a>--%>

                    <a href="/updateTableUIController?id=${node.id}" onclick="">修改</a>
                    <a href="#" onclick="delTable('${node.id}')">删除</a>
                </td>
            </tr>
        </c:forEach>

        </tbody>
    </table>
</div>

</body>
</html>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false"%>

<html>
<head>
    <title>index</title>
    <link rel="stylesheet" type="text/css" href="css/indexstyle.css">

    <script src="js/jquery-1.11.3.min.js"></script>
    <script src="js/jquery-1.12.2.js"></script>
    <script src="/js/flow_script.js"></script>

    <script type="text/javascript">

        function delTable(id) {
            var isDel = confirm("您确定要删除吗？Are you sure you want to delete it?");
            if(isDel){
                //要删除
                location.href = "/delTableController?id="+id;
            }
        }

    </script>

</head>
<body>
<div>
    <h2>ADDFLOW</h2>
</div>

<%--<div>--%>
    <%--<h2>Input Data In Form</h2>--%>
    <%--<form name="Form" action="/addTableController" method="post">--%>
        <%--&lt;%&ndash;<input type="text" id="flowid">&ndash;%&gt;--%>
        <%--<input type="text" id="id" name="id" placeholder="id">--%>
        <%--<input type="text" id="priority" name="priority" placeholder="priority">--%>
        <%--<input type="text" id="table_id" name="table_id" placeholder="table_id">--%>
        <%--<input type="text" id="hard-timeout" name="hard_timeout" placeholder="hard-timeout">--%>
        <%--<input type="text" id="idle-timeout" name="idle_timeout" placeholder="idle-timeout">--%>
        <%--<input type="text" id="flow-name" name="flow_name" placeholder="flow-name">--%>
        <%--<input type="text" id="in-port" name="in_port" placeholder="in-port">--%>
        <%--<input type="text" id="instruction-order" name="instruction_order" placeholder="instruction-order">--%>
        <%--<input type="text" id="action-order" name="action_order" placeholder="action-order">--%>
        <%--<input type="text" id="output-node-connector" id="output_node_connector" placeholder="output-node-connector">--%>
        <%--<input type="button" id="submit-put" value="put">--%>

    <%--</form>--%>
<%--</div>--%>

<div>
    <h2>Input Data In Form</h2>
    <form name="Form" action="/addTableController" method="post">
        <%--<input type="text" id="flowid">--%>
        <input type="text" id="id" name="id" placeholder="id">
        <input type="text" id="priority" name="priority" placeholder="priority">
        <input type="text" id="table_id" name="table_id" placeholder="table_id">
        <input type="text" id="hard-timeout" name="hard_timeout" placeholder="hard-timeout">
        <input type="text" id="idle-timeout" name="idle_timeout" placeholder="idle-timeout">
        <input type="text" id="flow-name" name="flow_name" placeholder="flow-name">
        <input type="text" id="in-port" name="in_port"placeholder="in-port">
        <input type="text" id="instruction-order" name="instruction_order" placeholder="instruction-order">
        <input type="text" id="action-order" name="action_order" placeholder="action-order">
        <input type="text" id="output-node-connector" name="output_node_connector" placeholder="output-node-connector">
        <%--<input type="button" id="submit-put" value="put">--%>
        <button type="submit" id="submit-put" value="put">put</button>
    </form>
</div>



<form action="/addTableController" method="post">
                <button type="submit" value="确定">确定</button>
                <%--<input type="button" value="put">--%>
</form>

<div class="table-b">
    <table style="border:1px solid">
        <thead>
        <tr >
            <th>id</th>
            <th>priority</th>
            <th>table_id</th>
            <th>hard-timeout</th>
            <th>idle-timeout</th>
            <th>flow-name</th>
            <th>in-port</th>
            <th>instruction-order</th>
            <th>action-order</th>
            <th>output-node-connector</th>
            <th>operate</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${tableList }" var="tab">
            <tr>
                <td>${tab.id}</td>
                <td>${tab.priority}</td>
                <td>${tab.table_id}</td>
                <td>${tab.hard_timeout}</td>
                <td>${tab.idle_timeout}</td>
                <td>${tab.flow_name}</td>
                <td>${tab.in_port}</td>
                <td>${tab.instruction_order}</td>
                <td>${tab.action_order}</td>
                <td>${tab.output_node_connector}</td>
                <td>
                    <%--<a href="#" onclick="editCustomer(${})">修改</a>--%>
                    <%--<a href="#" onclick="deleteCustomer(${})">删除</a>--%>

                    <a href="/updateTableUIController?id=${tab.id}" onclick="">修改</a>
                    <a href="#" onclick="delTable('${tab.id}')">删除</a>
                </td>
            </tr>
        </c:forEach>

        </tbody>
    </table>
</div>





</body>
</html>

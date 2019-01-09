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
</head>

<body>

<div>
    <h2>UPDATEFLOW</h2>
</div>
<div>
    <h2>Update Data In Form</h2>
    <form name="Form" action="/updateTableController" method="post">
        <%--<input type="text" id="flowid">--%>
        <input type="hidden" id="id" name="id" value="${table.id}" placeholder="id">
        <input type="text" id="priority" name="priority" value="${table.priority}" placeholder="priority">
        <input type="text" id="table_id" name="table_id" value="${table.table_id}" placeholder="table_id">
        <input type="text" id="hard-timeout" name="hard_timeout" value="${table.hard_timeout}" placeholder="hard-timeout">
        <input type="text" id="idle-timeout" name="idle_timeout" value="${table.idle_timeout}" placeholder="idle-timeout">
        <input type="text" id="flow-name" name="flow_name" value="${table.flow_name}" placeholder="flow-name">
        <input type="text" id="in-port" name="in_port" value="${table.in_port}" placeholder="in-port">
        <input type="text" id="instruction-order" name="instruction_order" value="${table.instruction_order}" placeholder="instruction-order">
        <input type="text" id="action-order" name="action_order" value="${table.action_order}" placeholder="action-order">
        <input type="text" id="output-node-connector" name="output_node_connector" value="${table.output_node_connector}" placeholder="output-node-connector">
        <%--<input type="button" id="submit-put" value="put">--%>
        <button type="submit" id="submit-put" value="put">put</button>
    </form>
</div>

</body>
</html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false"%>


<html>
<head>
    <title>index</title>
    <link rel="stylesheet" type="text/css" href="css/indexstyle.css">
</head>

<body>

<div>
    <h2>UPDATEFLOW</h2>
</div>
<div>
    <h2>Update Data In Form</h2>
    <form name="Form" action="/updateTableController" method="post">
        <%--<input type="text" id="flowid">--%>
        <input type="hidden" name="id" value="${table.id}" placeholder="id">
        <input type="text" name="priority" value="${table.priority}" placeholder="priority">
        <input type="text" name="table_id" value="${table.table_id}" placeholder="table_id">
        <input type="text" name="hard_timeout" value="${table.hard_timeout}" placeholder="hard-timeout">
        <input type="text" name="idle_timeout" value="${table.idle_timeout}" placeholder="idle-timeout">
        <input type="text" name="flow_name" value="${table.flow_name}" placeholder="flow-name">
        <input type="text" name="in_port" value="${table.in_port}" placeholder="in-port">
        <input type="text" name="instruction_order" value="${table.instruction_order}" placeholder="instruction-order">
        <input type="text" name="action_order" value="${table.action_order}" placeholder="action-order">
        <input type="text" name="output_node_connector" value="${table.output_node_connector}" placeholder="output-node-connector">
        <%--<input type="button" id="submit-put" value="put">--%>
        <button type="submit" value="put">put</button>
    </form>
</div>

</body>
</html>

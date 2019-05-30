<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>list</title>
</head>
<body>
    <h3>用户列表</h3>
    <table border="1">
        <tr>
            <td>账户ID</td>
            <td>用户ID</td>
            <td>余额</td>
        </tr>
        <c:forEach var="account" items="${list}">
            <tr>
                <td>${account.accountId}</td>
                <td>${account.uid}</td>
                <td>${account.money}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/website/header.jsp" %>
<html>
<head>
    <title>Lista użytkowników</title>
</head>
<body>

<div>

    <div>
        <h6 >Lista użytkowników</h6>
    </div>

    <div>
        <table>
            <tr>
                <th>Id</th>
                <th>Nazwa użytkownika</th>
                <th>Email</th>
                <th>Score</th>
            </tr>

            <c:forEach items="${users}" var="user">
                <tr>
                    <td>${user.id}</td>
                    <td>${user.userName}</td>
                    <td>${user.email}</td>
                    <td>
                        <a href='<c:url value="/userDeleteServlet?id=${user.id}"/>'>Usuń</a>
                        <a href='<c:url value="/userEditServlet?id=${user.id}"/>'>Edit</a>
                        <a href='<c:url value="/usersListServlet?id=${user.id}"/>'>Pokaż</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>

</body>
</html>

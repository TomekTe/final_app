<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/website/header.jsp" %>

<html>
<head>
    <title>Dodawanie użytkownika</title>

</head>
<body>

    <div>
        <h6>Dodaj użytkownika</h6>
    </div>

    <div>
        <form method="post">
            <div>
                <label for="userName">Nazwa</label>
                <input name="userName" type="text" class="form-control" id="userName" placeholder="Nazwa użytkownika">
            </div>
            <div>
                <label for="userEmail">Email</label>
                <input name="userEmail" type="email" class="form-control" id="userEmail" placeholder="Email użytkownika">
            </div>

            <button type="submit">Zapisz</button>
        </form>
    </div>

</body>
</html>

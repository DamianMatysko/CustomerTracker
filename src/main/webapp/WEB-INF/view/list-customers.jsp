<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Customers List</title>
</head>
<body>
<div id="wrapper" style="border: groove;border-radius: 10px;text-align: center;border-top-color: skyblue;">
    <div id="header">
        <h2>Customer Manager</h2>
    </div>
</div>
<div id="container">
    <input type="button" value="Add Customer" onclick="window.location.href='showFormForAdd'; return false;"class="add-button"/>
    <div id="content" style="position: relative;
            top: 50px;
            border: groove;
            border-radius: 10px;
            border-top-color: red;
            text-align: -webkit-center;">
        <table style="text-align: center;
               border-spacing: 20px;
               letter-spacing: 1px;
               inline-size: -webkit-fill-available;
               }">
            <tr>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Email</th>
            </tr>
            <c:forEach var="tempCustomer" items="${customers}">
                <tr>
                    <td>${tempCustomer.firstName}</td>
                    <td>${tempCustomer.lastName}</td>
                    <td>${tempCustomer.email}</td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Employee Management System</title>

    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
</head>

<body>
    <div class="container">
        <h1>Employee Management System</h1>
        <hr>
        <h2>Update Employee</h2><h4>this is ${student.rollNo}</h4>

        <form action="/updatedetails"  method="POST" >

            <!-- Add hidden form field to handle update -->
            <input type="hidden" name="id" value="${student.id}" class="form-control mb-4 col-4" />
            <input type="text" name="rollNo" value="${student.rollNo}" class="form-control mb-4 col-4">
            <input type="text" name="studentName" value="${student.studentName}" class="form-control mb-4 col-4">
            <input type="text" name="dept" value="${student.dept}" class="form-control mb-4 col-4">
            <input type="text" name="studentPlace" value="${student.studentPlace}" class="form-control mb-4 col-4">

            <button type="submit" class="btn btn-info col-2"> Update student </button>
        </form>

        <hr>

        <a href="${pageContext.request.contextPath}/"> Back to Employee List</a>
    </div>
</body>

</html>


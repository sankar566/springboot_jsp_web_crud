<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Student Management System</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
</head>

<body>
    <div class="container">
        <h1>New Student added </h1>
        <hr>
        <h2>Save Student</h2>

        <form action="/saveStudent" method="POST">
            <input type="text" name="rollNo" placeholder="Student Roll Number" class="form-control mb-4 col-4">

            <input type="text" name="studentName" placeholder="Student Name" class="form-control mb-4 col-4">

            <input type="text" name="dept" placeholder="Student dept" class="form-control mb-4 col-4">
            <input type="text" name="studentPlace" placeholder="Student Place" class="form-control mb-4 col-4">

            <button type="submit" class="btn btn-info col-2">Submit</button>
        </form>

        <hr>

        <a href="${pageContext.request.contextPath}/"> Back to Employee List</a>
               
    </div>
</body>

</html>
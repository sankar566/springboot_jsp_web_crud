<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Management System</title>
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
   <!-- below two links used for  jquerry data tables & id="student_table_jquerry_datatable"-->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
  <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/v/bs4/dt-1.10.21/datatables.min.css"/>
</head>
<body>
 <div class="container my-2">
   <a href="${pageContext.request.contextPath}/showNewStudentForm" class="btn btn-primary btn-sm mb-3"> Add Student </a>
 
 <h1>Student List </h1>
  <table border="1" class="table table-striped table-responsive-md" id="student_table_jquerry_datatable">
            <thead>
                <tr>
                    <th>Student RollNo</th>
                    <th>Student Name</th>
                    <th>Department</th>
                     <th> Place </th>
                     <th> Actions </th>
                </tr>
            </thead>
            <tbody>
               <c:forEach items="${listStudents}" var="student">
				<tr>
					<td>${student.rollNo}</td>
					<td>${student.studentName}</td>
					<td>${student.dept}</td>
					<td>${student.studentPlace}</td>
					
					<td> 
					     <a href="deleteStudent/${student.id}" class="btn btn-danger">delete</a>
					     <a href="updatestudent/${student.id}" class="btn btn-primary">update</a>
                 
                  <!--   <a href="${pageContext.request.contextPath}/deleteStudent" /{id}(id=${student.id})}" class="btn btn-danger">Delete</a>
                         <a href="${pageContext.request.contextPath}/showFormForUpdate" /{id}(id=${student.id})}" class="btn btn-primary">Update</a>
                  -->
                          </td>
				</tr>
			    </c:forEach>
            </tbody>
          
     </table>
   </div>
  <script src = "https://unpkg.com/jquery@3.3.1/dist/jquery.min.js"></script>
  <script type="text/javascript" src="https://cdn.datatables.net/v/bs4/dt-1.10.21/datatables.min.js"></script>
  <script>
      $(document).ready(function() {
	     $('#student_table_jquerry_datatable').DataTable();
	  } );
  </script>
		
</body>

</html>
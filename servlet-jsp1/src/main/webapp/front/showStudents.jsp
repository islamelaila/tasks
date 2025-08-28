
<%@page import="java.util.List"%>
<%@page import="model.Student"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Table</title>
<link rel="stylesheet" type="text/css" href="styleShowStudent.css">
</head>
<body>

<%
List<Student> students = new ArrayList<>();
students.add(new Student(1, "Islam", "pass123"));
students.add(new Student(2, "Ahmed", "abc456"));
students.add(new Student(3, "Sara", "xyz789"));
students.add(new Student(4, "Mona", "mona2025"));
%>

<table>
    <tr>
        <th>ID</th>
        <th>Username</th>
        <th>Password</th>
    </tr>
<%
for (Student student : students) {
%>
    <tr>
        <td><%= student.getId() %></td>
        <td><%= student.getUserName() %></td>
        <td><%= student.getPassword() %></td>
    </tr>
<%
}
%>
</table>

</body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Data</title>
<link rel="stylesheet" href="student.css">
</head>
<body>
    <div class="form-container">
        <h2>Student Registration Data</h2>
        <table class="data-table">
            <tr>
                <th>Field</th>
                <th>Value</th>
            </tr>
            <tr>
                <td>Full Name</td>
                <td>${param.name}</td>
            </tr>
            <tr>
                <td>Email</td>
                <td>${param.email}</td>
            </tr>
            <tr>
                <td>Password</td>
                <td>${param.password}</td>
            </tr>
            <tr>
                <td>Age</td>
                <td>${param.age}</td>
            </tr>
            <tr>
                <td>Gender</td>
                <td>${param.gender}</td>
            </tr>
            <tr>
                <td>Country</td>
                <td>${param.country}</td>
            </tr>
            <tr>
                <td>Subscribe to Newsletter</td>
                <td>${param.newsletter != null ? "Yes" : "No"}</td>
            </tr>
        </table>
    </div>
        
  <%
    String name = request.getParameter("name").toUpperCase();
    String email = request.getParameter("email");
    String password = request.getParameter("password");
    String age = request.getParameter("age");
    String gender = request.getParameter("gender");
    String country = request.getParameter("country");
    String newsletter = request.getParameter("newsletter") != null ? "Yes" : "No";
%>

<div class="form-container">
    <h2>Student Registration Data</h2>
    <table class="data-table">
        <tr><th>Field</th><th>Value</th></tr>
        <tr><td>Full Name</td><td><%= name %></td></tr>
        <tr><td>Email</td><td><%= email %></td></tr>
        <tr><td>Password</td><td><%= password %></td></tr>
        <tr><td>Age</td><td><%= age %></td></tr>
        <tr><td>Gender</td><td><%= gender %></td></tr>
        <tr><td>Country</td><td><%= country %></td></tr>
        <tr><td>Subscribe to Newsletter</td><td><%= newsletter %></td></tr>
    </table>
    
    
    
    
</body>
</html>

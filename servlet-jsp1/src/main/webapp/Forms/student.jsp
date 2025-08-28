<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Registration</title>
<link rel="stylesheet" href="student.css">
</head>
<body>
    <div class="form-container">
        <h2>Student Registration</h2>
        <form action="student-data.jsp" method="post">
            <label for="name">Full Name:</label>
            <input type="text" id="name" name="name" placeholder="Enter your full name" required>

            <label for="email">Email:</label>
            <input type="email" id="email" name="email" placeholder="Enter your email" required>

            <label for="password">Password:</label>
            <input type="password" id="password" name="password" placeholder="Enter your password" required>

            <label for="age">Age:</label>
            <input type="number" id="age" name="age" min="10" max="100" required>

            <label for="gender">Gender:</label>
            <select id="gender" name="gender" required>
                <option value="">Select Gender</option>
                <option value="male">Male</option>
                <option value="female">Female</option>
                <option value="other">Other</option>
            </select>

            <label for="country">Country:</label>
            <select id="country" name="country" required>
                <option value="">Select Country</option>
                <option value="egypt">Egypt</option>
                <option value="usa">USA</option>
                <option value="uk">UK</option>
                <option value="other">Other</option>
            </select>

            <label>
                <input type="checkbox" name="newsletter"> Subscribe to newsletter
            </label>

            <button type="submit">Register</button>
        </form>
    </div>
</body>
</html>

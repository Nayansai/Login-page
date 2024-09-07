<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Login</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background: linear-gradient(to right, #ff7e5f, #feb47b);
        color: #333;
        margin: 0;
        padding: 0;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
    }
    .login-container {
        background-color: rgba(255, 255, 255, 0.8);
        padding: 20px;
        border-radius: 15px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        width: 300px;
        text-align: center;
    }
    .login-container h1 {
        color: #333;
        margin-bottom: 20px;
    }
    .login-container table {
        width: 100%;
        margin-bottom: 20px;
    }
    .login-container td {
        padding: 10px 0;
        text-align: left;
    }
    .login-container input[type=text],
    .login-container input[type=password] {
        width: calc(100% - 24px);
        padding: 10px;
        border: 2px solid #ffa07a;
        border-radius: 10px;
        margin-left: 2px;
    }
    .login-container input[type=submit],
    .login-container input[type=reset] {
        border: 2px solid #32cd32;
        border-radius: 10px;
        padding: 10px 20px;
        background-color: #f7ed7e;
        cursor: pointer;
        margin: 5px;
    }
    .login-container input[type=submit]:hover,
    .login-container input[type=reset]:hover {
        background-color: #ffe4b5;
    }
</style>
</head>
<body>
<div class="login-container">
  <h1>User Login</h1>
  <form action="LoginServlet" method="post">
    <table>
      <tr>
        <td>Enter Name:</td>
        <td><input type="text" name="txtName"></td>
      </tr>
      <tr>
        <td>Enter Password:</td>
        <td><input type="password" name="txtPwd"></td>
      </tr>
    </table>
    <div>
      <input type="submit" value="Login">
      <input type="reset" value="Reset">
    </div>
  </form>
</div>
</body>
</html>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


    <%@ page isELIgnored="false" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="/WEB-INF/views/header.jsp" %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>RIDER GEAR</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

  <style>
   body {
   background-image:url("resources/images/img23.jpg");
    
    background-repeat;
}
  .carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
   width:800px;
height:400px;
      margin: auto;
  }
  </style>
</head>
<body>


<div class="container">
  <div id="Signup" class="mailbox col-sm-6 col-sm-offset-3">
  <div class="panel panel-default">
  <div class="panel-heading">  
<form:form method="POST" action="./register" commandName="user">
  <table>
  <h2>RIDER REGISTER</h2>
  <p>REGISTER YOUR SAFETY:</p>
  <table class="table table-bordered">
   
    <tr>
        <td><form:label path="username">username</form:label></td>
        <td><form:input path="username" required="true" /></td>
        
    </tr>
    <tr>
        <td><form:label path="email">email</form:label></td>
        <td><form:input path="email"  required="true" /></td>
    </tr>
    <tr>
        <td><form:label path="password">password</form:label></td>
        <td><form:input path="password" required="true" /></td>
    </tr>
    <tr>
        <td><form:label path="passwordconfirm">passwordconfirm</form:label></td>
        <td><form:input path="passwordconfirm" required="true" /></td>
    </tr>
    
   <tr>
        <td colspan="2">
            <input type="submit" value="Register"/>
        </td>
    </tr>
</table>  
    </form:form>
    </div>
    </div>
    </div>
    </div>
    </body>
</html>
   




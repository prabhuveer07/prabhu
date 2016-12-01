<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>RIDER GEAR</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a style="color:#2980b9" class="navbar-brand" href="Home"><span class="glyphicons glyphicons-tower"></span><em>RIDER GEAR</em></a>
    </div>
    <ul class="nav navbar-nav">
      
      
      
      <li><a href="AP">UPDATE</a></li>
      <li><a href="listpage">VIEW</a></li>
     
    </ul>
    
     <c:if test="${sessionScope.mt ne null }">
     <ul class="nav navbar-nav navbar-right">
     <h3> YO! ${sessionScope.mt }</h3>
      <li><a href="Logout"><span class="glyphicon glyphicon-user"></span> LOGOUT</a></li>
      
    </ul>
    </c:if>
  </div>
</nav>  
       
          
    

</body>
</html>
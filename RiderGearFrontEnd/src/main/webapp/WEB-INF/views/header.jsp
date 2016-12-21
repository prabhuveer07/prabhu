<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a style="color:#2980b9" class="navbar-brand" href="Home"><span class="glyphicons glyphicons-tower"></span><em>RIDER GEAR</em></a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="Home">Home</a></li>
      
      
      <li><a href="ABOUT US">ABOUT US</a></li>
    <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="Categories">CATEGORIES<span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="Categories?lion=GP">GP</a></li>
          <li><a href="Categories?lion=MOTO CROSS">MOTO CROSS</a></li>
          <li><a href="Categories?lion=RACE SUITS">RACE SUITS</a></li>
          <li><a href="Categories?lion=GLOVES">GLOVES</a></li>
          <li><a href="Categories?lion=BOOTS">BOOTS</a></li>
          <li><a href="Categories?lion=PROTECTORS">PROTECTORS</a></li>
     </ul>
     </li>
       </ul>
    
    <c:if test ="${sessionScope.mt eq null}">
    <ul class="nav navbar-nav navbar-right">
      <li><a href="Signup "><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li><a href="Login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
    </ul>
    </c:if>
    <c:if test="${sessionScope.mt ne null }">
    <h3> YO! ${sessionScope.mt }</h3>
    <ul class="nav navbar-nav navbar-right">
    <li> <a href="Logout">Logout</a></li>
    </ul>
    </c:if>
  </div>
</nav>
</body>
</html>
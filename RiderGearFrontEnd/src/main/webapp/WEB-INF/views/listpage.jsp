<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>


<html>
<head>
<%@include file="/WEB-INF/views/adminhead.jsp" %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>RIDER GEAR</title>
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

 <style>
   body {
   background-image:url("resources/images/img20.jpg");
    
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
  <div id="Signup" class="mailbox">
  <div class="panel panel-default">
  <div class="panel-heading"> 

<H1> List of Products</H1>
	 
	<table border="0" class="table table-striped table-inverse">
		<tr>
		
			<th>id</th>
			<th>category</th>
			<th>description</th>
			<th>manufacturer</th>
			<th>name</th>
			<th>price</th>
			<th>available</th>
			<th>edit/delete</th>
		</tr>
		<!--  for Each book b in books -->
		
		<c:forEach items="${jaz}" var="b">
<tr>
		<td> ${b.id}</td>
		<td>${b.category}</td>
		<td>${b.description}</td>
		<td>${b.manufacturer}</td>
		<td>${b.name}</td>
		<td>${b.price}</td>
		<td>${b.available}</td>
		
		
		
	   	<td>
	   	<a href="getProductsByid/${b.id}" ></a>
		
		<a href="admin/product/edit/${b.id }"><span class="glyphicon glyphicon-wrench"></span></a>
		<a href="admin/product/delete/${b.id }"><span class="glyphicon glyphicon-scissors"></span></a>
		
	
		</td>
		</tr>
		</c:forEach>
	</table>
	</div>
	</div>
	</div>
	</div>
</body>
</html>







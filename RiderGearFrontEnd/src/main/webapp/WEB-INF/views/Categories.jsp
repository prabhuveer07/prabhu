<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="/WEB-INF/views/header.jsp" %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>RIDER GEAR</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

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

  <h1 style="color:yellow;"><em>RIDER GEAR</em></h1>
  <p style="color:yellow;"><em>PREMIUM MOTOR SPORT GEAR</em></p>
</div>




<div id="Categories" class="mailbox col-sm-6 col-sm-offset-3">
<div class="panel panel-default">
<div class="panel-heading">
<title>CATEGORIES</title>
<table border="0" class="table table-striped table-hover" >
<tr>

            <th>manufacturer</th>
			<th>name</th>
			<th>price</th>
</tr>

<c:forEach items="${cat}" var="lion">

<tr>
         <td>${lion.getManufacturer() }</td>
         <td>${lion.getName() }</td>
         <td>${lion.getPrice() }</td>
         
         <td>
         <a href="listPost/${lion.getId()}"><span class="glyphicon glyphicon-camera"></span></a>
         </td>
         
         
         
   </tr>
</c:forEach>
</table>
</div>
</div>

</div>

</body>
</html>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>RIDER GEAR</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  <style>
  body {
   background-image:url("resources/images/img28.jpg");
    
    background-repeat;
}
  .carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
      width: 70%;
      margin: auto;
  }
  </style>
</head>
<body>
<jsp:include page="adminhead.jsp"></jsp:include>
  

  <div class="container">
  <div id="Signup" class="mailbox col-sm-6 col-sm-offset-3">
  <div class="panel panel-default">
  <div class="panel-heading">
  <form:form method="POST" action="./productpost" commandName="prod" enctype="multipart/form-data">
  
  
  <h2>ADD PRODUCT</h2>
  
  <table class="table table-bordered">
  
    
    <tr>
        <td><form:label path="category">category</form:label></td>
        <td><form:input path="category" /></td>
    </tr>
    <tr>
        <td><form:label path="description">description</form:label></td>
        <td><form:input path="description" /></td>
    </tr>
    <tr>
        <td><form:label path="manufacturer">manufacturer</form:label></td>
        <td><form:input path="manufacturer" /></td>
    </tr>
    <tr>
        <td><form:label path="name">name</form:label></td>
        <td><form:input path="name" /></td>
    </tr>
    <tr>
        <td><form:label path="price">price</form:label></td>
        <td><form:input path="price" /></td>
    </tr>
    <tr>
        <td><form:label path="available">available</form:label></td>
        <td><form:input path="available" /></td>
    </tr>
    
    
    <tr>
        <td colspan="2">
            
            <p><label for="image">Choose Image</label></p>
            <p><input name="file" id="fileToUpload" type="file" /></p> 
            <input type="submit" value="Submit"/>
            
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
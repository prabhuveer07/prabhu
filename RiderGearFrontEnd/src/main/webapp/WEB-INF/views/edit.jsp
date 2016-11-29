<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="/WEB-INF/views/adminhead.jsp" %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>RIDER GEAR</title>
</head>
<body>

	<form:form method="post" action="update" commandName="editProdObj">
	<br><br><br><br><br><br><br><br><br><br>
		<table>
		<tr>
			<td><form:label path="id">id</form:label></td>
			<td><form:input path="id" disabled="true"/>
			<form:hidden path="id" /></td>
           <tr>
        <td><form:label path="category">category</form:label></td>
        <td><form:input path="category" type="text" class="form-control" id="pd" /></td>
    </tr>
     <tr>
        <td><form:label path="description">description</form:label></td>
        <td><form:input path="description" type="text" class="form-control" id="pd"/></td>
    </tr>
   
    <tr>
        <td><form:label path="manufacturer">manufacturer</form:label></td>
        <td><form:input path="manufacturer" type="text" class="form-control" id="pd" /></td>
    </tr>
    <tr>
        <td><form:label path="name">name</form:label></td>
        <td><form:input path="name" type="text" class="form-control" id="pd" /></td>
    </tr>
    
    <tr>
        <td><form:label path="price">price</form:label></td>
        <td><form:input path="price" type="text" class="form-control" id="pd" /></td>
    </tr>
    
     <tr>
        <td><form:label path="available">available</form:label></td>
        <td><form:input path="available" type="text" class="form-control" id="pd" /></td>
    </tr>
    
 
	     <tr>
	    <td colspan="2"><input type="submit" value="edit"></td>
	    </tr>
		</table>
	</form:form>
</body>
</html>
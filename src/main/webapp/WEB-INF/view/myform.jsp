<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Byer Registration Form</h1>

<form:form action="saveForm" method="post" modelAttribute="buyer">

<form:hidden path="id"/>

<table >
  

  <tr>
    <td>Full Name</td>
    <td><form:input path="name" placeholder="Full Name"/></td> 
  </tr>
   <tr>
    <td>Age</td>
    <td><form:input path="age" placeholder="Age" /></td> 
  </tr>
   <tr>
    <td>City</td>
    <td><form:input path="city" placeholder="City"/></td> 
  </tr>
   <tr>
    <td>Product Name</td>
    <td><form:input path="pname" placeholder="Product Name"/></td> 
  </tr>
   <tr>
    <td>Product Model</td>
    <td><form:input path="pmodel" placeholder="Product Model"/></td> 
  </tr>
   <tr>
    <td>Price</td>
    <td><form:input path="price" placeholder="Price"/></td> 
  </tr>
  <tr>
    <td>Delivery Date</td>
    <td><form:input path="ddate" placeholder="Delivery Date"/></td> 
  </tr>
  
</table>

<input type="submit" value="Save">
</form:form>
</body>
</html>
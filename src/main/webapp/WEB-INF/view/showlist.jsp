<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<table border="1">
  <tr>
    <th>ID</th>
    <th>Full Name</th>
    <th>Age</th> 
    <th>City</th>
    <th>Product Name</th>
    <th>Product Model</th>
    <th>Price</th>
    <th>Delivery Date</th>
    <th>Action</th>
  </tr>
  
  <c:forEach var="tempbuyer" items="${buyer}">
  <c:url var="updateLink" value="showUpdateForm">
     <c:param name="id" value="${tempbuyer.id}"/>
  </c:url>
  <c:url var="deleteLink" value="DeleteBuyer">
     <c:param name="id" value="${tempbuyer.id}"/>
  </c:url>
  <tr>
    <td>${tempbuyer.id}</td>
    <td>${tempbuyer.name}</td> 
    <td>${tempbuyer.age}</td>
    <td>${tempbuyer.city}</td>
    <td>${tempbuyer.pname}</td>
    <td>${tempbuyer.pmodel}</td>
    <td>${tempbuyer.price}</td>
    <td>${tempbuyer.ddate}</td>
    <td><a href="${updateLink}">Update</a>|<a href="${deleteLink}">Delete</a></td>
  </tr>
  </c:forEach>
  
</table>
<br>
<a href="/showform">Add Buyer</a>
<a href="/SearchBuyer">Search Buyer</a>
</body>
</html>
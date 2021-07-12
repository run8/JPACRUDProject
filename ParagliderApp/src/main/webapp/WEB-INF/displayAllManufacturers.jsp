<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All manufacturers</title>
</head>
<body>

	<c:forEach var="pm" items="${pms}">

<table style="width: 100%">
		<tr>
			<th>Company Name</th>
			<th>Company ID</th>
		</tr>
		<tr>
		<td>${pm.companyName}</td>
 		<td>${pm.id}</td>
		</tr>
		<tr>
			<th>Year Founded</th>
			<th>Base Country</th>
			<th>Web Address</th>
		</tr>
		<tr>
			<th>${pm.yearFounded}</th>
			<th>${pm.country}</th>
			<th>${pm.url}</th>
		</tr>
		<tr>
			<th>Company Description</th>
		</tr>
		<tr>
			<td>${pm.description}</td>
		</tr>
	</table>
	</c:forEach>
	

</body>
</html>
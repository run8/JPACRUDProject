<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>

<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<link rel="stylesheet" href="main.css">

<title>Manufacturer Added</title>
</head>

<body>

	<h1>Paraglider Manufacturer</h1>

	<table style="width: 100%">
		<tr>
			<th>Company Name Header</th>
			<th>Company ID Header</th>
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
	
	<div class="col-sm-4">
			<form action="um.do" >
			<input type="hidden" value="${pm.id}" name="id" >
				<input type="submit" value="Update Manufacturer" class="btn btn-primary addNewButton">
			</form><br>
		</div>

</body>
</html>
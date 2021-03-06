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

<title>Paraglider Manufacturer Site</title>
</head>

<body>
<table style="width: 100%">

	<h1>Paraglider Manufacturer</h1>

	<h1>Manufacturer Query</h1>

	<div class="outline">
		<div class="row">
			<div class="col-sm-2">
				<form method=GET action="listManufacturerById.do">
					<div class="input-group input-group-sm mb-3">
						<div class="input-group-text">Search by Manufacturer ID</div>
						<input type="number" class="form-control" id="ManufacurerId"
							name="id" required>
						<button type="submit" class="btn btn-primary">Search</button>
					</div>
				</form>
			</div>

			<div class="row">
				<div class="col-sm-2">
					<form method=GET action="searchByCountry.do">
						<div class="input-group input-group-sm mb-3">
							<div class="input-group-text">Search Manufacturers by Country</div>
							<input type="text" class="form-control" id="keyword"
								name="countryName" value="">
							<button type="submit" class="btn btn-primary">Search</button>
						</div>
					</form>
				</div>
			</div>
		</div>

		<div class="col-sm-4">
			<form action="listAllManufacturers.do" method=GET>
				<input type="submit" value="List All Manufacturers" class="btn btn-primary addNewButton">
			</form><br>
		</div><br>
		
		<div class="col-sm-4">
			<form action="addManufacturer.do" method=GET>
				<input type="submit" value="Add Manufacturer" class="btn btn-primary addNewButton">
			</form><br>
		</div>
		
		

	</div>
	
	



	
		<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>
		</table>
</body>
</html>
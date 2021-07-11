<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Paraglider Manufacturer Site</title>
</head>

<body>

	<h1>Paraglider Manufacturer</h1>

	${paraglider}


	<div class="container-fluid">

		<h1>Manufacturer Query</h1>



		<div class="outline">
			<div class="row">
				<div class="col-sm-8">
					<form method=GET action="searchByIdInput.do">
						<div class="input-group input-group-sm mb-3">
							<div class="input-group-text">Search by Manufacturer ID</div>
							<input type="number" class="form-control" id="ManufacurerId"
								name="filmId" required>
							<button type="submit" class="btn btn-primary">Search</button>
						</div>
					</form>
				</div>

				<div class="row">
					<div class="col-sm-8">
						<form method=GET action="searchByKeywordInput.do">
							<div class="input-group input-group-sm mb-3">
								<div class="input-group-text">Search by Keyword</div>
								<input type="text" class="form-control" id="keyword" name="keyword" value="">
								<button type="submit" class="btn btn-primary">Search</button>
							</div>
						</form>
					</div>
				</div>
			</div>
			
			
			<div class="row">
			<div class="col-sm-8">
				<form method=POST action="addFilm.do">
				
						<label for="title">Film Title:</label><br> 
						<input type="text" id="title" name="title" value=""><br>

						<label for="description">Film Description:</label><br> 
						<textarea id="description" name="description" maxlength="200" name="filmDescription" rows="4" cols="50"></textarea><br>

						<label for="rentalRate">Rental Rate ($):</label><br> 
						<input type="text" id="rentalRate" name="rentalRate" pattern="[0-9.]*" required><br>

						<label for="filmLength">Film Length (minutes):</label><br> 
						<input type="text" id="filmLength" name="filmLength" pattern="[0-9]*" required><br>

						<label for="replacementCost">Replacement Cost ($):</label><br> 
						<input type="text" id="replacementCost" name="replacementCost" pattern="[0-9.]*" required><br>

						Rental Duration (days): <select name="rentalDuration"  >
						<option value="3" selected>3</option>
						<option value="4">4</option>
						<option value="5">5</option>
						<option value="6">6</option>
						<option value="7">7</option>
					</select><br> 

					Rating: <select name="rating"  >
						<option value="G" selected>G</option>
						<option value="PG">PG</option>
						<option value="PG13">PG13</option>
						<option value="R">R</option>
						<option value="NC17">NC17</option>
					</select><br> 
					
					Release Year: <select name="releaseYear">
					<c:forEach begin="0" end="121" varStatus="loop">
						<option value="${2021-loop.current}">${2021-loop.current}</option>
						</c:forEach></select><br>
					
					Special Feature: <select name="specialFeature">
						<option value="" selected>None</option>
						<option value="Trailers">Trailers</option>
						<option value="Commentaries">Commentaries</option>
						<option value="DeletedScenes">DeletedScenes</option>
						<option value="BehindTheScenes">BehindTheScenes</option>
					</select><br> 
					
					Language: <select name="languageID">
						<option value="1" selected>English</option>
						<option value="2">Italian</option>
						<option value="3">Japanese</option>
						<option value="4">Mandarin</option>
						<option value="5">French</option>
						<option value="6">German</option>
					</select><br>
					
					Category: <select name="categoryId">
						<option value="1" selected>Action</option>
						<option value="2">Animation</option>
						<option value="3">Children</option>
						<option value="4">Classics</option>
						<option value="5">Comedy</option>
						<option value="6">Documentary</option>
						<option value="7">Drama</option>
						<option value="8">Family</option>
						<option value="9">Foreign</option>
						<option value="10">Games</option>
						<option value="11">Horror</option>
						<option value="12">Music</option>
						<option value="13">New</option>
						<option value="14">Sci-Fi</option>
						<option value="15">Sports</option>
						<option value="16">Travel</option>		
					</select><br><br>
					
					<input type="submit" value="Submit">
					
				</form>
			</div>
		</div>
			
			
			
			<div class="col-sm-4">
				<form action="add.do" method=GET>
					<button type="submit" class="btn btn-primary addNewButton">List all manufacturers</button>
				</form>
			</div>

		</div>
</body>
</html>
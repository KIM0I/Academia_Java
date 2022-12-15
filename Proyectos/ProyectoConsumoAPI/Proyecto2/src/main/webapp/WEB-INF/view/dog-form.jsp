<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

<head>
	<title>Save Dog</title>

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css">

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/add-dog-style.css">
</head>

<body>
	
	<div id="wrapper">
		<div id="header">
			<h2>Dog Patients</h2>
		</div>
	</div>

	<div id="container">
		<h3>Save Dog</h3>
	
		<form:form action="saveDog" modelAttribute="dog" method="POST">

			<!-- need to associate this data with customer id -->
			<form:hidden path="id" />
					
			<table>
				<tbody>
					<tr>
						<td><label>Name:</label></td>
						<td><form:input path="name" /></td>
					</tr>
				
					<tr>
						<td><label>Breed:</label></td>
						<td><form:input path="breed" /></td>
					</tr>

					<tr>
						<td><label>Age:</label></td>
						<td><form:input path="age" /></td>
					</tr>

					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Save" class="save" /></td>
					</tr>

				
				</tbody>
			</table>
		
		
		</form:form>
	
		<div style="clear; both;"></div>
		
		<p>
			<a href="${pageContext.request.contextPath}/dog/list">Back to List</a>
		</p>
	
	</div>

</body>

</html>











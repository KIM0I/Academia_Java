<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
	<title>List Customers</title>
	
	<!-- reference our style sheet -->

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css" />

</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>Dog Patients</h2>
		</div>
	</div>
	
	<div id="container">
	
		<div id="content">
		
			<!-- put new button: Add Dog -->
		
			<input type="button" value="Add Dog"
				   onclick="window.location.href='showFormForAdd'; return false;"
				   class="add-button"
			/>
		
			<!--  add our html table here -->
		
			<table>
				<tr>
					<th>Name</th>
					<th>Breed</th>
					<th>Age</th>
					<th>Action</th>
				</tr>
				
				<!-- loop over and print our dogs -->
				<c:forEach var="tempDog" items="${dogs}">
				
					<!-- construct an "update" link with dog id -->
					<c:url var="updateLink" value="/dog/showFormForUpdate">
						<c:param name="dogId" value="${tempDog.id}" />
					</c:url>					

					<!-- construct an "delete" link with dog id -->
					<c:url var="deleteLink" value="/dog/delete">
						<c:param name="dogId" value="${tempDog.id}" />
					</c:url>					
					
					<tr>
						<td> ${tempDog.name} </td>
						<td> ${tempDog.breed} </td>
						<td> ${tempDog.age} </td>
						
						<td>
							<!-- display the update link -->
							<a href="${updateLink}">Update</a>
							|
							<a href="${deleteLink}"
							   onclick="if (!(confirm('Are you sure you want to delete this dog?'))) return false">Delete</a>
						</td>
						
					</tr>
				
				</c:forEach>
						
			</table>
				
		</div>
	
	</div>
	

</body>

</html>










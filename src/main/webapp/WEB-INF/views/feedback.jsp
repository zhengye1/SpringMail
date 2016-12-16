<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<title>Anonymous Feedback form</title>
<link href="<c:url value='/static/css/app.css' />" rel="stylesheet">
<link href="<c:url value='/static/css/bootstrap.min.css' />"
	rel="stylesheet">
</head>
<body>
	<div class="wrapper">
		<form:form method="POST" modelAttribute="mail">
			<div class="form-group">
				<div class="row">
					<label for="feedback">Feedback: </label>
					<form:textarea path="feedback" rows="5" col="30" />
					<div class="has-error">
						<form:errors path="feedback" class="help-inline" />
					</div>
				</div>
				<div class="row">
					<div class="feedbackSubmit">
						<input type="submit" value="Send" />
					</div>
				</div>
			</div>
		</form:form>
	</div>
</body>
</html>
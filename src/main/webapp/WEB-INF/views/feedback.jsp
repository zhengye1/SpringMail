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
		<p>To send a message to the instructor, use the form below.
			Feedback of all kinds is welcome. You do not need to enter your name
			or email address unless you wish to receive a direct response. Note
			that your question or a paraphrase of it (but not your name) may be
			posted (and answered) on the discussion board, in lecture, or in some
			other public forum.</p>
		<p></p>
		<form:form method="POST" modelAttribute="mail">
			<div class="form-group">
				<div class="row">
					<label for="name">(Optional) Your Name: </label>
					<form:input path="name" />
				</div>
				<div class="row">
					<label for="email">(Optional) Your Email: </label>
					<form:input path="email" />
				</div>
				<div class="row">
					<label for="feedback">Your Message: </label>
				</div>
				<div class="row">
					<form:textarea path="feedback" rows="15" cols="40" />
					<div class="has-error">
						<form:errors path="feedback" class="help-inline" />
					</div>
				</div>
				<div class="row">
					<div class="feedbackSubmit">
						<input type="submit" value="Submit Feedback" />
					</div>
				</div>
			</div>
		</form:form>
	</div>
</body>
</html>
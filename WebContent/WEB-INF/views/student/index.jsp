<%@ page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>Spring MVC</title>
<base href="${pageContext.servletContext.contextPath}/">
<style>
div {
	display: inline-block;
	text-align: center;
	margin: 5px;
	padding: 5px;
	border: 1em dotted orange;
	border-radius: 5px;
}
</style>
</head>
<body>
	<h1>Hello Dũng Đẹp Zai:</h1>
	<div>
		<img alt="" src="${photo}"> <br /> <strong>${name1}</strong> <em>${salary*level1}</em>
	</div>
	<div>
		<img alt="" src="${photo}"> <br /> <strong>${name2}</strong> <em>${salary*level2}</em>
	</div>
	<div>
		<img alt="" src="${photo}"> <br /> <strong>${name3}</strong> <em>${salary*level3}</em>
	</div>
</body>
</html>

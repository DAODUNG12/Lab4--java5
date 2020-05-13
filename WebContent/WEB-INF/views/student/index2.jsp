<%@ page pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>Spring MVC</title>
<base href="${pageContext.servletContext.contextPath}/">
<style>
table {
	border-collapse: collapse;
	width: 100%;
}

th, td {
	line-height: 25px;
	border: 1px solid black;
	padding: 5px;
}

th {
	background-color: gray;
}
</style>
</head>
<body>
	<h1>Hello Dũng Đẹp Zai:</h1>
	<table>
		<tr>
			<th>Tên SP</th>
			<th>Giá Cũ</th>
			<th>Giảm Giá</th>
			<th>Giá Mới</th>
		</tr>

		<c:forEach var="p" items="${prods}">
			<tr>
				<td>${p.name}</td>
				<td><fmt:formatNumber value="${p.unitPrice}" type="currency" />
				<td><fmt:formatNumber value="${p.discount}" type="percent" />
				<td><fmt:formatNumber value="${p.newPrice}" type="currency" />
			</tr>
		</c:forEach>

	</table>

</body>
</html>

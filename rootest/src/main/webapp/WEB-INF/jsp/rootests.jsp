<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
</head>
<div>
   <c:forEach var="rootest" items="${rootestList}">
   		<p>${rootest.id }</p>
   </c:forEach>
	<a href="<c:url value="j_spring_security_logout" />" > Logout</a>
</div>
</html>
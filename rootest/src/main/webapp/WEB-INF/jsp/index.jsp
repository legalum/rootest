<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
</head>
<div>
   <c:forEach var="rootest" items="rootestList">
   	<p>${rootest.id }</p>
   </c:forEach>
</div>
</html>
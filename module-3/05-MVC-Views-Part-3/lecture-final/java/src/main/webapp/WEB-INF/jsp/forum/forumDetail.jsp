<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/header.jsp">
 	<c:param name="pageTitle">The Solar System Geek Forum</c:param>
 </c:import>

<h2><c:out value="${topic.title}"/></h2>

<p>More stuff goes here...</p>

<c:import url="/WEB-INF/jsp/footer.jsp" />

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	if (session.getAttribute("name") == null) {
		response.sendRedirect("index.jsp?error=1");
	}
%>


<b>Hello <%=session.getAttribute("name")%></b>
<br>


<a href="logout.jsp">Click here to logout</a>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<title>JSP Java Bean Demo</title>

Inside file1.jsp (here is where Javabean is created and its properties set)

<jsp:useBean id="productBean121" class="com.simpli.ProductBean"
	scope="session"></jsp:useBean>
	

  <jsp:setProperty property="productId" name="productBean121" value="101"/>	
  <jsp:setProperty property="productName" name="productBean121" value="HP Camera"/>	
  <jsp:setProperty property="price" name="productBean121" value="1500.25"/>	
  
  
  Inside file1.jsp (here is where Javabean  productBean122 is created 
  and its properties set by capturing form data automatically)
  <jsp:useBean id="productBean122" class="com.simpli.ProductBean"
	scope="session"></jsp:useBean>
	<jsp:setProperty property="*" name="productBean122" />
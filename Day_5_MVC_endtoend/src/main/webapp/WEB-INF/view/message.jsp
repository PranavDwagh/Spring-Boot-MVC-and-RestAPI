<%@page import="study.entity.BookEntity"%>
<html>

<%
	BookEntity obj = (BookEntity) request.getAttribute("bookname");
	String name = obj.getName();
%>
Book ${name }  Added!!
<a href="GetAllBooks.jsp">Get All Books</a>

</html>
<%@page import="study.entity.BookEntity"%>
<%@page import="java.util.List"%>
<html>

<body>
<table border="2px">
<%

List<BookEntity> list = (List<BookEntity>) request.getAttribute("list");

for(BookEntity be: list)
{%>
	
	<tr><td><%= be.getId() %></td>
	<td><%= be.getName() %></td>
	<td><%= be.getCost() %></td></tr>
		
	
	
<%}

%>
</table>

</body>


</html>
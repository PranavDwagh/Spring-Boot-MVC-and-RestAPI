<%@page import="study.entity.GroceryEntity"%>
<%@page import="java.util.List"%>
<html>

<body>
<%
	
	List<GroceryEntity> list = (List<GroceryEntity>)request.getAttribute("list");
	for(int i=0; i<list.size();i++)
	{%>
		<%=list.get(i) %><br><br>
	<%}
%>
</body>

</html>
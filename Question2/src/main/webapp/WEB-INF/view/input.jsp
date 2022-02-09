<%@page import="java.util.List"%>
<html>

<body>
<form action="delete" method="post">
<%
	List<String> list = (List<String>)request.getAttribute("list");
	list.forEach(System.out :: println);
	System.out.println("you are here");
%>
	<select name="name">

<%	for(int i=0; i<list.size();i++)
	{%>
		<option value=<%=list.get(i) %>><%=list.get(i) %></option>
	<%}

%>
</select>
	
<input type="submit" value="Delete">
	
</form>
</body>
</html>
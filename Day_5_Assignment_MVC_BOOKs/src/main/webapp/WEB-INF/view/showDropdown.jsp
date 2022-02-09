<%@page import="java.util.List"%>
<html>

<body bgcolor="cyan">
<center>
Select Id from dropdown
<form action="delete" method="post">
<%
List<Integer> list = (List<Integer>)request.getAttribute("list");
if(!list.isEmpty())
{%>
	<select name= "dropdown">
	<%
	for(int i=0; i<list.size();i++)
	{
		int id = list.get(i);
		%>
		<option value="<%=id %>"><%=id %></option>		
	<%}
	
	%>
	</select>
	<input type="submit" value="delete"/>
	<%
}
%>

</center>
</form>

</body>

</html>
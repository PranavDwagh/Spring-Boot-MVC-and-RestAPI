<%@page import="java.util.*,study.entity.*" %>
We will see the books Here : -
<table border=1>
<%

List<BookEntity> list = (List<BookEntity>)request.getAttribute("books"); 

for(BookEntity be : list ){
%>

<tr><td><%=be.getBookName() %></td></tr>

<% }//end of for %>
</table>
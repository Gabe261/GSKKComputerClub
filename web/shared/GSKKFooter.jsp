<%@page import="java.util.GregorianCalendar, java.util.Calendar" %>
<%
  GregorianCalendar now = new GregorianCalendar();
  int nowYear =  now.get(Calendar.YEAR);
%>

<footer>
    <p>&COPY; Copyright <%=nowYear %> Gabriel Siewert & Kihoon Kim</p>
</footer>
</body>    
</html>

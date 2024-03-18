<%-- 
    Document   : GSKKDisplayBooks
    Created on : Feb 24, 2024, 8:04:11 PM
    Author     : gabed
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<jsp:include page="shared/GSKKBanner.jsp"/>
    <main>
        <h1>List of Books</h1>
        <table>
            <thead>
                <tr>
                    <th>Code</th>
                    <th>Description</th>
                    <th>Quantity</th>
                </tr>
            </thead>
            <tbody>
                <!-- forEach loop for all the books passed by the GSKKDisplayBooksServlet -->
                <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
                <c:forEach var="book" items="${books}">
                    <tr>
                        <td><c:out value="${book.code}"/></td>
                        <td><c:out value="${book.description}"/></td>
                        <td><c:out value="${book.quantity}"/></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <form action="GSKKAddBook.jsp" method="post">
            <input type="submit" value="Add Book" style="margin-left: 10px">
        </form>
    </main>
<jsp:include page="shared/GSKKFooter.jsp"/>

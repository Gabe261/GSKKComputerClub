<%-- 
    Document   : GSKKAddBook
    Created on : Feb 25, 2024, 12:31:39 PM
    Author     : gabed
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<jsp:include page="shared/GSKKBanner.jsp"/>
    <main>
        <h1>Add a book</h1>
        <span class="errormsg">${errormsg}</span>
        <form action="GSKKAddBook" method="post">      
            <label class="pad_top">Code: </label>
            <input type="text" name="code" style="width:100px" value="${book.code}"><br>
            <label class="pad_top">Description: </label>
            <input type="text" name="description" style="width:400px" value="${book.description}"><br>
            <label class="pad_top">Quantity:  </label>
            <input type="text" name="quantity" style="width:50px" value="${book.quantity}"><br>
            <button type="submit" style="margin: 10px 0">Add Book</button>
        </form>
        <form action="GSKKDisplayBooks" method="post">
            <input type="submit" value="Cancel">
        </form>
    </main>
<jsp:include page="shared/GSKKFooter.jsp"/>

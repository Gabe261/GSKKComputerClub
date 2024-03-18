<%-- 
    Document   : GSKKError
    Created on : 25-Feb-2024, 3:00:00 PM
    Author     : Gabriel Siewert
--%>

<jsp:include page="shared/GSKKBanner.jsp"/>
    <section>
        <h1>Java Error</h1>
        <p>Sorry, Java has thrown an exception.</p>
        <p>To continue, click the Back button.</p>

        <h2>Details</h2>
        <p>Type: ${pageContext.exception["class"]}</p>
        <p>Message: ${pageContext.exception.message}</p>
    </section>
<jsp:include page="shared/GSKKFooter.jsp"/>
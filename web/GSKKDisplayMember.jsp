<%@page contentType="text/html" pageEncoding="UTF-8"%>

<jsp:include page="shared/GSKKBanner.jsp"/>
     <main>
        <h2>Thanks for joining our club!!!!!!</h2>
        <p>Here is the information you entered</p>
        <label>Full Name:</label>
        <span>${member.fullName}</span><br>
        <label>Email:</label>
        <span>${member.email}</span><br>
        <label>Phone:</label>
        <span>${member.phone}</span><br>
        <label>IT Program: </label>
        <span>${member.programName}</span><br>    
        <label>Year Level: </label>
        <span>${member.levelOfYear}</span><br>
        <p>To register another member, click on the Back button in your browser or the return button shown below.</p>
        <form action="GSKKRegister.jsp" method="get">
            <button type="submit">Return</button>
        </form>
    </main>
<jsp:include page="shared/GSKKFooter.jsp"/>
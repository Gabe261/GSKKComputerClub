<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="shared/GSKKBanner.jsp"/>
    <main>
        <h4>New Member Registration Form</h4>
        <form action="RegisterServlet" method="post">      
            <label class="pad_top">Full Name:</label>
            <input type="text" name="fullName" required style="width:200px"><br>
            <label class="pad_top">Email: </label>
            <input type="email" name="email"  required style="width:250px"><br>
            <label class="pad_top">Phone: </label>
            <input type="text" name="phone" style="width:100px"><br>
            <label class="pad_top">IT Program: </label>
            <select name="programName">
                <option value="CAS">CAS</option>
                <option value="SQATE">SQATE</option>
                <option value="CPA">CPA</option>
                <option value="ITID">ITID</option>
                <option value="CAD">CAD</option>
                <option value="ITSS">ITSS</option>
            </select><br>
            <label class="pad_top">Year Level: </label>
            <select name="levelOfYear">
                <option value="1">1</option>
                <option value="2">2</option>
                <option value="3">3</option>
                <option value="4">4</option>
            </select><br>
            <div class="buttonGroup" style="padding-left: 170px; padding-top: 20px;">
                <input type="submit" value="Register Now!">
                <input type="reset" value="Reset">
            </div>
    </form>
    </main>
<jsp:include page="shared/GSKKFooter.jsp"/>
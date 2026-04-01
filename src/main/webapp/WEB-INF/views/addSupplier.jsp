<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="header.jsp" %>

<h3>Add Supplier</h3>

<form action="/suppliers/save" method="post">
    Name: <input type="text" name="name"/><br>
    Contact: <input type="text" name="contact"/><br>
    Address: <input type="text" name="address"/><br>

    <input type="submit" value="Save"/>
</form>

<%@ include file="footer.jsp" %> 
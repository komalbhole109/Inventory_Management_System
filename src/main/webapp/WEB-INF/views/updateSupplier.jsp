<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="header.jsp" %>

<h3>Update Supplier</h3>

<form action="/suppliers/save" method="post">
    <input type="hidden" name="id" value="${supplier.id}"/>

    Name: <input type="text" name="name" value="${supplier.name}"/><br>
    Contact: <input type="text" name="contact" value="${supplier.contact}"/><br>
    Address: <input type="text" name="address" value="${supplier.address}"/><br>

    <input type="submit" value="Update"/>
</form>

<%@ include file="footer.jsp" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="header.jsp" %>

<h3>Supplier List</h3>

<a href="/suppliers/add">Add Supplier</a>

<table border="1">
<tr>
    <th>ID</th>
    <th>Name</th>
    <th>Contact</th>
    <th>Address</th>
    <th>Action</th>
</tr>

<c:forEach var="s" items="${suppliers}">
<tr>
    <td>${s.id}</td>
    <td>${s.name}</td>
    <td>${s.contact}</td>
    <td>${s.address}</td>
    <td>
        <a href="/suppliers/delete/${s.id}">Delete</a>
    </td>
</tr>
</c:forEach>

</table>

<%@ include file="footer.jsp" %> 
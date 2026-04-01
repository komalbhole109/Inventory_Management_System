<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="header.jsp" %>

<h3>Product List</h3>

<a href="/products/add">Add Product</a>

<table border="1">
<tr>
    <th>ID</th>
    <th>Name</th>
    <th>Category</th>
    <th>Price</th>
    <th>Image</th>
    <th>Action</th>
</tr>

<c:forEach var="p" items="${products}">
<tr>
    <td>${p.id}</td>
    <td>${p.name}</td>
    <td>${p.category}</td>
    <td>${p.price}</td>
    <td><img src="/images/${p.image}" width="80"/></td>
    <td>
        <a href="/products/delete/${p.id}">Delete</a>
    </td>
</tr>
</c:forEach>

</table>

<%@ include file="footer.jsp" %> 
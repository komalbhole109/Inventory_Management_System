<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="header.jsp" %>

<h3>Stock List</h3>

<a href="/stocks/add">Add Stock</a>

<table border="1" style="width:80%; text-align:center;">
	<tr>
    <th>ID</th>
    <th>Product</th>
    <th>Supplier</th>
    <th>Quantity</th>
    <th>Action</th>
</tr>

    <tr>
        <th>ID</th>
        <th>Product Name</th>
        <th>Quantity</th>
    </tr>

    <!-- ✅ ADD HERE -->
    <c:forEach var="stock" items="${stockList}">
        <tr>
            <td>${stock.id}</td>
            <td>${stock.product.name}</td>
            <td>${stock.quantity}</td>
        </tr>
    </c:forEach>


</table>
<%@ include file="footer.jsp" %> 
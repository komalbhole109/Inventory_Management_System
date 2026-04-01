<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="header.jsp" %>

<h3>Update Stock</h3>

<form action="/stocks/save" method="post">
    <input type="hidden" name="id" value="${stock.id}"/>

    Product ID: <input type="number" name="product.id" value="${stock.product.id}"/><br>
    Supplier ID: <input type="number" name="supplier.id" value="${stock.supplier.id}"/><br>
    Quantity: <input type="number" name="quantity" value="${stock.quantity}"/><br>

    <input type="submit" value="Update"/>
</form>

<%@ include file="footer.jsp" %> 
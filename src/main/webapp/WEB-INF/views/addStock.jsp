<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="header.jsp" %> 
<h3>Add Stock</h3>

<form action="/stocks/save" method="post">
    Product ID: <input type="number" name="product.id"/><br>
    Supplier ID: <input type="number" name="supplier.id"/><br>
    Quantity: <input type="number" name="quantity"/><br>

    <input type="submit" value="Save"/>
</form>

<%@ include file="footer.jsp" %> 
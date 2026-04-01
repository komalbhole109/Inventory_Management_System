<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="header.jsp" %>

<h3>Update Product</h3>

<form action="/products/save" method="post">
    <input type="hidden" name="id" value="${product.id}"/>

    Name: <input type="text" name="name" value="${product.name}"/><br>
    Category: <input type="text" name="category" value="${product.category}"/><br>
    Price: <input type="number" name="price" value="${product.price}"/><br>
    Image: <input type="text" name="image" value="${product.image}"/><br>

    <input type="submit" value="Update"/>
</form>

<%@ include file="footer.jsp" %> 
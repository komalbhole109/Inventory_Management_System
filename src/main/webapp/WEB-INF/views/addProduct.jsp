<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="header.jsp" %> 
<a href="/products/add">Add Product</a>

<form action="/products/save" method="post">
    Name: <input type="text" name="name"/><br>
    Category: <input type="text" name="category"/><br>
    Price: <input type="number" name="price"/><br>
    Image: <input type="text" name="image"/><br>

    <input type="submit" value="Save"/>
</form>

<%@ include file="footer.jsp" %> 
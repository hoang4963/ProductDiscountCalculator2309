<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product Discount Calculator</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<h2>Product Discount Calculator</h2>
<form method="post" action="/calculate">
    <h3> Product Description </h3> <br/>
    <input type="text" name="Description" placeholder="Description"/><br/>
    <h3> List Price </h3> <br/>
    <input type= number name="Price" placeholder="Price"/><br/>
    <h3> List Price </h3> <br/>
    <input type= number name="DiscountPercent" placeholder="Discount Percent"/><br/>
    <input type = "submit" id = "submit" value = "Calculate"/>
</form>
</body>
</html>
<%--
  Created by IntelliJ IDEA.
  User: 金城武
  Date: 2018/3/10
  Time: 17:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>商品展示</title>
</head>
<body>
    <table>
        <tr>
            <c:forEach items="${listGoods}" var="good">
                ${good.goods_name}
            </c:forEach>
        </tr>

        <tr></tr>
        <tr></tr>
    </table>
</body>
</html>

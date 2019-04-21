<%--
  Created by IntelliJ IDEA.
  User: 1
  Date: 2019/4/21
  Time: 13:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <script>
        var p1 = "${pageContext.request.contextPath}";
        console.log("这边是唔需要的东西");
        console.log(p1);
    </script>
</head>
<body>

  <h3>这是第二次成功 ！！！！</h3>
  <a href="${pageContext.request.contextPath}/success4.jsp"> 继续跳转 到别的网页去 </a>
</body>
</html>

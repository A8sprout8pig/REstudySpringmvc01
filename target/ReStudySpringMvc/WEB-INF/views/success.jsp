<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>success成功返回的试图解析 </title>

    <script  >

        var path = "${pageContext.request.contextPath}";
        console.log(path);

    </script>
</head>
<body>
   <h3>success成功！！！</h3>

   <a href="/b/tetsb?username=sxf&age=20">testb</a>
    <a href="test2">点击去success2的页面 （先到后台，在转发给前台）</a><br>

   <a href="/b/testa">testing</a>

</body>
</html>

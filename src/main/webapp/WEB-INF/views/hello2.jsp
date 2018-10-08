<%--
  Created by IntelliJ IDEA.
  User: xiaohu.zheng
  Date: 2018/9/29
  Time: 15:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    简单的跳转
    <div>
        <input type="text" id="name"  name="myname"/>
        <input type="button" value="用户名" onclick="fun()"/>
    </div>

    <form id = "demo" action="/boy/1" method="post">
         <input type="text" id="name1"  name="myname1"/>
         <input type="text" id="name2"  name="myname2"/>
        <input type="submit" value="form表单submit"/>
    </form>
</body>
<script>
   function fun() {
       window.open("/hello/" + document.getElementById("name").value);
   }
</script>
</html>

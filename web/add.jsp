<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/6/6
  Time: 21:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加音乐</title>
</head>
<body>
    <form action="/music/add" method="POST">
        音乐名: <input type="text" name="musicName">
        <br />
        歌手名: <input type="text" name="singerName" />
        <br />
        专辑名: <input type="text" name="albumName">
        <br />
        url: <input type="text" name="url">
        <br />
        <input type="submit" value="提交" />
    </form>
</body>
</html>

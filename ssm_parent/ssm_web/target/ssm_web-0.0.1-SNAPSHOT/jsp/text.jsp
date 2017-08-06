<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/8/5
  Time: 18:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>博文广场</title>
    <script src="../bootstrap/jquery-1.11.1.min.js"></script>
    <link rel="icon" href="../images/favicon.ico">
    <link rel="stylesheet" href="../css/login.css">
    <script src="../js/html5.js"></script>
</head>
<body>
<header>
    <div class="wrap">
        <div class="logo">
            <a href="${pageContext.request.contextPath}/jsp/login.jsp">
                <img src="../upload/logo.png" width="341" height="68" alt="Hello world..">
            </a>
        </div><!-- logo -->
        <div class="social">
            <ul class="clearfix">
                <%--<li><a class="social-facebook" href="#" title="待开发">facebook</a></li>--%>
                <%--<li><a class="social-twitter" href="#" title="待开发">twitter</a></li>--%>
                <%--<li><a class="social-googleplus" href="#" title="待开发">google plus</a></li>--%>
                <a href="#" style="font-size: 20px;margin-right: 80px;">博文广场</a>
                <a href="#" style="font-size: 20px;margin-right: 80px;">私人博园</a>
                <a href="#" style="font-size: 20px;">关于</a>
            </ul>
        </div><!-- social -->
        <div class="separator"></div>

        <!-- 测试数据 -->
        <div>
            <span>当前登录用户：<a href="#" title="查看个人资料">${username}</a></span>
            <span><a href="/user/out.do" style="float: right;">退出登录</a></span>
        </div>
    </div>
</header>

<%-- 主体内容 --%>
<h1>功能待开发</h1>

<script src="../js/library.js"></script>
<script src="../js/script.js"></script>
<script src="../js/retina.js"></script>
</body>
</html>

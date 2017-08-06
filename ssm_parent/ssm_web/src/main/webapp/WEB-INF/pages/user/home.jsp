<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/8/4
  Time: 10:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>后台登陆</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/reset.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/supersized.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/style.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/styles.css">

    <script src="${pageContext.request.contextPath}/assets/js/jquery-1.8.2.min.js"></script>
    <script src="${pageContext.request.contextPath}/assets/js/supersized.3.2.7.min.js"></script>
    <script src="${pageContext.request.contextPath}/assets/js/supersized-init.js"></script>
    <script src="${pageContext.request.contextPath}/assets/js/scripts.js"></script>
    <%--<script>--%>
        <%--$(function () {--%>
            <%--$("input[name='name']").focus();--%>

            <%--var number = parseInt(Math.random() * 7) + 1;--%>

            <%--$.ajax({--%>
                <%--type: "POST",--%>
                <%--url: "/post/aphorism.do",--%>
                <%--data: {id: number},--%>
                <%--dataTpye: "json",--%>
                <%--success: function (data) {--%>
                    <%--$("#aphorism").html(data);--%>
                <%--}--%>
            <%--});--%>
        <%--});--%>
    <%--</script>--%>
</head>
<body>
<c:if test="${username != null}">
    <jsp:forward page="/jsp/login.jsp"/>
</c:if>
<div class="page-container">
    <div class="wrapper">
        <div class="container">
            <strong><span style="font: 25px/1.5 'Microsoft YaHei',arial,tahoma,\5b8b\4f53,sans-serif;">
                登  录</span></strong>
            <form class="form" action="/user/login.do" method="post">
                <input type="text" name="name" placeholder="用户名">
                <input type="password" name="password"  placeholder="密 码">
                <button type="submit" id="login-button">登 录</button>
            </form>
            <%--The greatest test of courage on earth is to bear defeat without losing heart.--%>

            <span id="aphorism">${post}</span>
            <%-- ${aphorism} --%>
        </div>
    </div>
</div>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/8/4
  Time: 12:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>后台首页</title>
    <script src="../bootstrap/jquery-1.11.1.min.js"></script>
    <link rel="icon" href="../images/favicon.ico">
    <link rel="stylesheet" href="../css/login.css">
    <script src="../js/html5.js"></script>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body class="no-js">

<c:if test="${username == null || username == ''}">
  <jsp:forward page="${pageContext.request.contextPath}/WEB-INF/pages/user/index.jsp"/>
</c:if>

<section class="main">
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
          <a href="/user/text.do" style="font-size: 20px;margin-right: 80px;">博文广场</a>
          <a href="#" style="font-size: 20px;margin-right: 80px;">私人博园</a>
          <a href="#" style="font-size: 20px;">关于</a>
        </ul>
      </div><!-- social -->
      <div class="separator"></div>

      <!-- 测试数据 -->
      <div>
        <span class="dis">当前登录用户：</span><a href="#" title="查看个人资料">${username}</a>
        <span><a href="/user/out.do" style="float: right;">退出登录</a></span>
      </div>
    </div>
  </header>

  <section class="caption">
    <div class="wrap">
      <h1 class="dis">将心比心  以心换心</h1>
    </div><!-- wrap -->
  </section>
  <section class="slider">
    <div class="wrap">
      <div class="swiper-container">
        <div class="swiper-wrapper">
          <div class="swiper-slide">
            <img src="../upload/slide.jpg" width="940" style="height: 380px;" alt="">
          </div><!-- swiper-slide -->
          <div class="swiper-slide">
            <img src="../upload/TheGoddess.png" width="940" style="height: 380px;" alt="">
          </div><!-- swiper-slide -->
          <div class="swiper-slide">
            <img src="../upload/sun.jpg" width="940" style="height: 380px;" alt="">
          </div><!-- swiper-slide -->
        </div>
        <div class="swiper-pagination-wrapper">
          <div class="swiper-pagination"></div>
        </div><!-- /swiper-pagination-wrapper -->
      </div>
    </div><!-- wrap -->
  </section><!-- slider -->
</section>

<script src="../js/jquery.js"></script>
<script src="../js/library.js"></script>
<script src="../js/script.js"></script>
<script src="../js/retina.js"></script>
</body>
</html>

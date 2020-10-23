<%--
  Created by IntelliJ IDEA.
  User: xiaofeiwang
  Date: 2020-10-22
  Time: 4:11 p.m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Title</title>
    <%@ include file="../common/head.jsp"%>
    <meta name="viewport" content="initial-scale=1, maximum-scale=1">
    <link rel="shortcut icon" href="/favicon.ico">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/css/common/sm.min.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/css/common/sm-extend.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/shop/shoplist.css">
</head>
<body>
<header class="bar bar-nav">
    <h1 class="title">商店列表</h1>
</header>
<div class="content">
    <div class="content-block">
        <p>
            你好,<span id="user-name"></span><a class="pull-right"
                                              href="shopadmin/shopoperation">增加店铺</a>
        </p>
        <div class="row row-shop">
            <div class="col-40">商店名称</div>
            <div class="col-40">状态</div>
            <div class="col-20">操作</div>
        </div>
        <div class="shop-wrap"></div>
    </div>
    <div class="content-block">
        <div class="row">
            <div class="col-33">
                <a href="local/accountbind?usertype=2"
                   class="button button-big button-fill button-success">帐号绑定</a>
            </div>
            <div class="col-33">
                <a href="#" id="log-out" usertype="2"
                   class="button button-big button-fill button-danger">退出系统</a>
            </div>
            <div class="col-33">
                <a href="local/changepsw?usertype=2"
                   class="button button-big button-fill button-success"
                   id="bindOrChange">修改密码</a>
            </div>
        </div>
    </div>
</div>


<script type='text/javascript'
        src='${pageContext.request.contextPath}/resources/js/common/zepto.min.js' charset='utf-8'></script>
<script type='text/javascript'
        src='${pageContext.request.contextPath}/resources/js/common/sm.min.js' charset='utf-8'></script>
<script type='text/javascript'
        src='${pageContext.request.contextPath}/resources/js/common/sm-extend.min.js' charset='utf-8'></script>
<script type='text/javascript' src='${pageContext.request.contextPath}/resources/js/shop/shoplist.js'
        charset='utf-8'></script>
<script type='text/javascript' src='${pageContext.request.contextPath}/resources/js/local/logout.js'
        charset='utf-8'></script>
</body>
</html>

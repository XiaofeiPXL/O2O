<%--
  Created by IntelliJ IDEA.
  User: xiaofeiwang
  Date: 2020-10-22
  Time: 4:13 p.m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>商店管理</title>
    <%@ include file="../common/head.jsp"%>
    <meta name="viewport" content="initial-scale=1, maximum-scale=1">
    <link rel="shortcut icon" href="/favicon.ico">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/css/common/sm.min.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/css/common/sm-extend.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/shop/shopmanagement.css">
</head>
<body>
<header class="bar bar-nav">
    <h1 class="title">商店管理</h1>
</header>
<div class="content">
    <div class="content-block">
        <div class="row">
            <div class="col-50 mb">
                <a id="shopInfo" href="shopadmin/shopoperation"
                   class="button button-big button-fill">商铺信息</a>
            </div>
            <div class="col-50 mb">
                <a href="shopadmin/productmanagement"
                   class="button button-big button-fill">商品管理</a>
            </div>
            <div class="col-50 mb">
                <a href="shopadmin/productcategorymanagement"
                   class="button button-big button-fill">类别管理</a>
            </div>
            <div class="col-100 mb">
                <a href="shopadmin/shoplist"
                   class="button button-big button-fill button-danger">返回</a>
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
<script type='text/javascript'
        src='${pageContext.request.contextPath}/resources/js/common/common.js' charset='utf-8'></script>
<script type='text/javascript' src='${pageContext.request.contextPath}/resources/js/shop/shopmanagement.js'
        charset='utf-8'></script>
</body>
</html>


<%--
  Created by IntelliJ IDEA.
  User: xiaofeiwang
  Date: 2020-10-22
  Time: 4:51 p.m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme()
            + "://"
            + request.getServerName()
            + ":"
            + request.getServerPort()
            + request.getContextPath()
            + "/";

    pageContext.setAttribute("basePath",basePath);
%>
<base href="<%=basePath%>">

<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%
    //结尾无斜杠[/]
    String ctx = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath();
    request.setAttribute("ctx",ctx);
%>
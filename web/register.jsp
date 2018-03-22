<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="com.ssh.entity.UserDao"%>
<jsp:useBean id="obj" class="com.ssh.entity.User"></jsp:useBean>
<jsp:setProperty property="*" name="obj" />

<%
    UserDao.save(obj);
    out.print("You are successfully registered");

%>

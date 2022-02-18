<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="sist.com.model.*"%>
<jsp:useBean id="model" class="sist.com.model.DataBoardModel"/>
<%
    // model => request, response전송 => 화면  
    model.databoardInsert(request, response);
%>
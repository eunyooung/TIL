<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Insert title here</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
   <style type="text/css">
    .container {
      margin-top: 50px;
    }
    
    .row {
      margin: 0px auto;
      width: 960px;
    }
  </style>
</head>
<body>
  <div class="container">
    <div class="row">
      <table class="table">
        <tr>
          <td>
            <h3 class="text-center">${vo.title }</h3>
          </td>
        </tr>
        <tr>
          <td>
            <img src="${vo.poster }" width=100%>
          </td>
        </tr>
        <tr>
          <td>${vo.msg }</td>
        </tr>
        <tr>
          <td>${vo.address }</td>
        </tr>
        <tr>
          <td class="text-right" colspan="5">
            <a href="javascript:history.back()" class="btn btn-sm btn-danger">목록</a>
          </td>
        </tr>
      </table>
    </div>
  </div>
</body>
</html>
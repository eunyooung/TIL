<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="sist.com.dao.*"%>
<%-- 상세보기 (HTML) --%>
<%
// 사용자가 보내준 데이터를 받는다 
   // response.sendRedirect("detail.jsp?no="+no);
   String no = request.getParameter("no");
   // 데이터베이스에서 사용자가 보내준 번호에 대한 데이터를 읽어 온다 
   FoodDAO dao = new FoodDAO();
   // JSP / Spring => 흐름 (동작순서)=> 순서대로 코딩 
   // JSP(데이터 전송(<a><form>)) => DAO => JSP화면 출력 
   FoodVO vo = dao.foodDetailData(Integer.parseInt(no));
%>

<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Insert title here</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <!-- 
      서블릿은 설정 => 실행순서(생명주기)
                    init() => service() => destory()
      => 1. 페이징기법 
         2. Cookie설정 
         3. Session설정 => 댓글 (로그인처리) id, name => 댓글 
   -->
  <style type="text/css">
    .container{
      margin-top: 50px;
    }
    .row {
      /* 크기 결정 */
      margin: 0px auto; 
      width:700px;
    }
    h1{
        text-align:center;
    }
  </style>
</head>
<body>
  <div class="container">
    <h1>&lt;<%= vo.getName() %>&gt; 상세보기</h1>
    <div class="row">
      <table class="table">
        <tr>
          <td class="text-center">
            <img src="<%=vo.getPoster() %>">
          </td>
        </tr>
        <tr>
         <td><%=vo.getName() %></td>
        </tr>
        <tr>
          <td>
            <%=vo.getScore() %>
          </td>
        </tr>
        <tr>
          <td>
            <%= vo.getType() %>
          </td>
        </tr>
        <tr>
          <td>
            <%= vo.getPrice() %>
          </td>
        </tr>
        <tr>
          <td>
            <%= vo.getAddress() %>
          </td>
        </tr>
        <tr>
          <td>
            <%= vo.getTel() %>
          </td>
        </tr>
        <tr>
        <tr>
          <td>
            <%= vo.getMenu() %>
          </td>
        </tr>
        <tr>
          <td colspan="2" class="text-right">
            <a href="list.jsp" class="btn btn-xs btn-success">목록</a>
          </td>
        </tr>
      </table>
    </div>
  </div>
</body>
</html>
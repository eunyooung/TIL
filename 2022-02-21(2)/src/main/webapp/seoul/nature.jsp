<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Insert title here</title>
</head>
<body>
  <div class="wrapper row3">
    <div id="breadcrumb" class="clear"> 
      <!-- ################################################################################################ -->
      <ul>
        <li>서울 자연/관광 목록</li>
      </ul>
      <!-- ################################################################################################ --> 
    </div>
  </div>
  <!-- ################################################################################################ --> 
  <!-- ################################################################################################ --> 
  <!-- ################################################################################################ -->
  <div class="wrapper row3">
    <main class="container clear"> 
      <!-- main body --> 
      <!-- ################################################################################################ -->
      <div class="content"> 
        <!-- ################################################################################################ -->
        <div id="gallery">
          <figure>
            <header class="heading">서울 자연/관광</header>
            <ul class="nospace clear">
              <c:forEach var="vo" items="${list }" varStatus="s">
                <c:choose>
                  <c:when test="${s.index%4==0}">
                   <li class="one_quarter first"><a href="../seoul/nature_detail.do?no=${vo.no }"><img src="${vo.poster }" title="${vo.title }"></a></li>
                  </c:when>
                  <c:otherwise>
                    <li class="one_quarter"><a href="../seoul/nature_detail.do?no=${vo.no }"><img src="${vo.poster }" title="${vo.title }"></a></li>
                  </c:otherwise>
                </c:choose>
              </c:forEach>
            </ul>
            <figcaption>멀리 가지 않아도 도심 속에서 느낄 수 있는 자연의 힐링</figcaption>
          </figure>
        </div>
        <!-- ################################################################################################ --> 
        <%-- class="current" --%>
        <!-- ################################################################################################ -->
        <nav class="pagination">
          <ul>
            <c:if test="${startPage>1 }">
              <li><a href="../seoul/seoul_nature.do?page=${startPage-1 }">&laquo;</a></li>
            </c:if>
            <c:set var="style" value=""/>
            <c:forEach var="i" begin="${startPage }" end="${endPage }">
              <c:if test="${i==curpage }">
                <c:set var="style" value="class=current"/>
              </c:if>
              <c:if test="${i!=curpage }">
                <c:set var="style" value=""/>
              </c:if>
              <li ${style }><a href="../seoul/seoul_nature.do?page=${i }">${i }</a></li>
            </c:forEach>
            <c:if test="${endPage<totalpage }">
              <li><a href="../seoul/seoul_nature.do?page=${endPage+1 }">&raquo;</a></li>
            </c:if>
          </ul>
        </nav>
        <!-- ################################################################################################ --> 
      </div>
      <!-- ################################################################################################ --> 
      <!-- / main body -->
      <div class="clear"></div>
    </main>
  </div>
</body>
</html>
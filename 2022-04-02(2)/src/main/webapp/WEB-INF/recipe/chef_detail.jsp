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
  <div class="wrapper row2">
    <div id="breadcrumb" class="clear"> 
      <!-- ################################################################################################ -->
      <ul>
        <li><a href="#">Home</a></li>
        <li><a href="#">레시피</a></li>
        <li><a href="#">쉐프 - 상세보가</a></li>
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
            <header class="heading">&lt;${chef }&gt;님의 레시피</header>
            <ul class="nospace clear">
              <c:forEach var="vo" items="${rList }" varStatus="s">
                <c:if test="${s.index%4==0 }">
                  <li class="one_quarter first"><a href="../recipe/detail.do?no=${vo.no }"><img src="${vo.poster }" title="${vo.title }"></a></li>
                </c:if>
                <c:if test="${s.index%4!=0 }">
                  <li class="one_quarter"><a href="../recipe/detail.do?no=${vo.no }"><img src="${vo.poster }" title="${vo.title }"></a></li>
                </c:if>
              </c:forEach>
            </ul>
          </figure>
        </div>
        <!-- ################################################################################################ -->
        <!-- ################################################################################################ -->
        <nav class="pagination">
        <!-- class="current" -->
          <ul>
            <c:if test="${startPage>1 }">
              <li><a href="../recipe/chef_detail.do?page=${startPage-1 }&chef=${chef}">&laquo; Previous</a></li>
            </c:if>
            <c:forEach var="i" begin="${startPage }" end="${endPage }">
              <c:if test="${i==curpage }">
                <c:set var="style" value="class=current"/>
              </c:if>
              <c:if test="${i!=curpage }">
                <c:set var="style" value=""/>
              </c:if>
              <li ${style }><a href="../recipe/chef_detail.do?page=${i }&chef=${chef}">${i }</a></li>
            </c:forEach>
            <c:if test="${endPage<totalpage }">
              <li><a href="../recipe/chef_detail.do?page=${endPage+1 }&chef=${chef}">Next &raquo;</a></li>
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
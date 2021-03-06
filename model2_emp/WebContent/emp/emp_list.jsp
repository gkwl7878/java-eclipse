<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css"  href="http://localhost:8080/model2_emp/common/css/main_v190130.css">
<style type="text/css">
#wrap{ margin:0px auto; width:800px; height:860px; }
#header{  width:800px; height:140px; background: #FFFFFF url(http://localhost:8080/model2_emp/common/images/header_bg.png) repeat-x;
			position: relative;	}
#headerTitle{ font-family: HT견고딕,고딕; font-size: 30px; font-weight: bold;text-align: center;
				position:absolute; top: 40px;left: 290px; }
#container{  width:800px; min-height:600px; }
#footer{  width:800px; height:120px; }
#footerTitle{ float: right;font-size: 15px; padding-top: 20px; padding-right: 20px }
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<script type="text/javascript">
	$(function() {
		
	});//ready
</script>
</head>
<body>
<div id="wrap">
	<div id="header">
	<div id="headerTitle">SIST Class4 </div>
	<div style="padding-top: 100px">
		<c:import url="../common/jsp/main_menu.jsp"/>
	</div>
	</div>
	<div id="container">
	<strong>${param.deptno}</strong>번 부서조회<br/>
	<a href="dept.do?cmd=D001">뒤로</a><br/>
	<table border="1">
	<tr>
		<th width="40">번호</th>
		<th width="80">사원번호</th>
		<th width="80">연봉</th>
		<th width="100">사원명</th>
		<th width="100">직무</th>
		<th width="100">고용일</th>
	</tr>
	<c:if test="${empty empList }">
	<tr>
		<td colspan="6" align="center">사원정보가 존재하지 않습니다.</td>
	</tr>
	</c:if>
	<c:forEach var="emp"  items="${ empList }">
	<c:set var="i" value="${ i+1 }"/>
	<tr>
		<td><c:out value="${i}"/></td>
		<td><c:out value="${emp.empno }"/></td>
		<td><c:out value="${emp.sal}"/></td>
		<td><c:out value="${emp.ename}"/></td>
		<td><c:out value="${emp.job}"/></td>
		<td><c:out value="${emp.hiredate}" escapeXml="false"/></td>
	</tr>
	</c:forEach>
	</table>
	</div>
	<div id="footer">
		<div id="footerTitle">copyright&copy; all right reserved. class 4</div>
	</div>
</div>
</body>
</html>









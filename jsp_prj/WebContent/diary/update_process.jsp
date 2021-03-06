<%@page import="kr.co.sist.util.ShaUtil"%>
<%@page import="java.sql.SQLException"%>
<%@page import="kr.co.sist.diary.dao.DiaryDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="du_vo" class="kr.co.sist.diary.vo.DiaryUpdateVO" scope="page"></jsp:useBean>
<jsp:setProperty property="*" name="du_vo"/>
<%
	du_vo.setPass(ShaUtil.shaEncoding(du_vo.getPass()));
%>
<div>
<% 
	DiaryDAO d_dao= DiaryDAO.getInstance();
	String img="",msg="";
	try{
		int cnt= d_dao.updateEvent(du_vo);
		if(cnt==0){ //변경된 행이 없음: 글번호를 조작했거나, 비밀번호가 틀렸을 때
			img="pass_fail.png";
			msg="비밀번호를 확인해 주세요.";
		}else{
			img="success_update.png";
			msg="글을 변경 하였습니다.";
		}//end if
	}catch(SQLException se){
		se.printStackTrace();
			img="construction.png";
			msg="죄송합니다. 장애처리에 최선을 다하고 있습니다.";
	}//end catch
%>
<img src="images/<%=img%>"/><br/>
		<%=msg%><br/>
<input type="button" value="닫기" id="btnCloseFrm"/>
</div>
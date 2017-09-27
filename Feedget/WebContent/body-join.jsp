<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <link href="static/join/css/join.css" rel="stylesheet" type="text/css" media="all" />

<div id="header-featured"> 
	<div class="joinForm row">
		<h3>계정 만들기</h3>
		<form class="join-input" method="POST" action="controller?action=join">
  			<div class="form-group col-md-12">
    			<input type="text" class="form-control" id="devEmail" name="devEmail" placeholder="이메일">
  			</div>
  			<div class="form-group col-md-12">
    			<input type="text" class="form-control" id="devName" name="devName" placeholder="이름">
  			</div>
  			<div class="form-group col-md-12">
    			<input type="password" class="form-control" id="devPassword" name="devPassword" placeholder="암호">
  			</div>
  			<div class="form-group col-md-12">
    			<input type="password" class="form-control" id="devPasswordVerify" name="devPasswordVerify" placeholder="암호 재입력">
  			</div>
  			<div class="form-group col-md-12">
    			<input type="text" class="form-control" id="devCompany" name="devCompany" placeholder="개발사 URL">
  			</div>
  			<div class="form-group col-md-12">
    			<input type="text" class="form-control" id="devSite" name="devSite" placeholder="웹사이트 주소">
  			</div>
  			<div class="form-group col-md-12">
    			<input type="text" class="form-control" id="devCategory" name="devCategory" placeholder="카테고리 태그">
  			</div>
  			<div class="form-group col-md-12">
    			<span>* 카테고리는 띄어쓰기로 구분하여 주세요.</span>
  			</div>
  			<button type="submit" class="btn btn-lg btn-block col-lg-2">JOIN</button>
		</form>	
	</div>
</div>
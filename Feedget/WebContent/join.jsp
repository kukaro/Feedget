<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>계정 만들기</title>
<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<link href="static/fonts.css" rel="stylesheet" type="text/css" media="all" />
<link href="static/index/css/default.css" rel="stylesheet" type="text/css" media="all" />
<link href="static/join/css/join.css" rel="stylesheet" type="text/css" media="all" />
<link href="http://fonts.googleapis.com/css?family=Source+Sans+Pro:200,300,400,600,700,900" rel="stylesheet" />
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
</head>
<body>

<!-- header -->
<div id="header-wrapper">
  <div id="header" class="container">
    <div id="logo">
      <h1><a href="#">Feedget</a></h1>
	</div>
    <div id="menu">
      <ul>
        <li class="current_page_item"><a href="#" accesskey="1" title="">Home</a></li>
        <li><a href="#" accesskey="2" title="">Search</a></li>
        <li><a href="#" accesskey="3" title="">Category</a></li>
        <li><a href="#" accesskey="4" title="">Mypage</a></li>
        <li><a href="#" accesskey="4" title="">Login</a></li>
      </ul>
    </div>
  </div>
</div>

<!-- middle-contents -->
<div id="header-featured"> 
	<div class="joinForm row">
				<h3>계정 만들기</h3>
				<form class="join-input" method="GET" action="DevSignUpController">
  					<div class="form-group col-md-12">
    					<input type="text" class="form-control" id="DevMail" name="DevEmail" placeholder="이메일">
  					</div>
  					<div class="form-group col-md-12">
    					<input type="text" class="form-control" id="DevName" name="DevName" placeholder="이름">
  					</div>
  					<div class="form-group col-md-12">
    					<input type="password" class="form-control" id="password" name="password" placeholder="암호">
  					</div>
  					<div class="form-group col-md-12">
    					<input type="text" class="form-control" id="company" name="company" placeholder="개발사이름">
  					</div>
  					<div class="form-group col-md-12">
    					<input type="text" class="form-control" id="address" name="address" placeholder="웹사이트 주소">
  					</div>
  					<div class="form-group col-md-12">
    					<input type="text" class="form-control" id="category" name="category" placeholder="카테고리 태그">
  					</div>
  					<div class="form-group col-md-12">
    					<span>* 카테고리는 띄어쓰기로 구분하여 주세요.</span>
  					</div>
  					<button type="button" class="btn btn-lg btn-block col-lg-2">JOIN</button>
				</form>
				
			</div>
</div>



<!-- footer -->
<div id="copyright" class="container">
  <p>&copy; Untitled. All rights reserved. | Photos by <a href="http://fotogrph.com/">Fotogrph</a> | Design by <a href="http://templated.co" rel="nofollow">TEMPLATED</a>.</p>
</div>


</body>
</html>
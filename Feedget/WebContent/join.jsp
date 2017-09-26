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
<link href="http://fonts.googleapis.com/css?family=Source+Sans+Pro:200,300,400,600,700,900" rel="stylesheet" />
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<style>
#header-featured {
	height:600px;
}
.joinForm {
	width:400px;
	height:450px;
	margin:20px auto;
	background-color:white;
}
.joinForm h3 {
	margin-top:45px;
	margin-bottom:45px;
	text-align:center;
}

.joinForm button {
	height:30px;
	margin:auto 10px;
	margin-top:30px;
	background-color:#1B9772;
}
.form-group {
	margin-bottom:15px;
}
tagA a {
 text-align:center;
}
.footer {
	height:40px;
	background-color:#F6F6F6;
	text-align:center;
	color:#8C8C8C;
}
</style>
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
				<form>
  					<div class="form-group col-md-12">
    					<input type="email" class="form-control" id="exampleInputEmail1" placeholder="이메일">
  					</div>
  					<div class="form-group col-md-12">
    					<input type="email" class="form-control" id="exampleInputEmail1" placeholder="이름">
  					</div>
  					<div class="form-group col-md-12">
    					<input type="password" class="form-control" id="exampleInputPassword1" placeholder="암호">
  					</div>
  					<div class="form-group col-md-12">
    					<input type="email" class="form-control" id="exampleInputEmail1" placeholder="암호 재입력">
  					</div>
  					<div class="form-group col-md-12">
    					<input type="email" class="form-control" id="exampleInputEmail1" placeholder="개발사이름">
  					</div>
  					<button type="submit" class="button col-md-11">가입하기</button>
				</form>
				
			</div>
</div>

<!-- bottom-contents -->
<div id="wrapper">
  
  <div id="extra" class="container">
    <h2>2백만여가지의 다양한 컨텐츠를 만나보세요.</h2>
    <span>Quisque dictum integer nisl risus, sagittis convallis, rutrum id, congue, and nibh</span> 
    <p>This is <strong>Breadth</strong>, a free, fully standards-compliant CSS template designed by <a href="http://templated.co" rel="nofollow">TEMPLATED</a>. The photos in this template are from <a href="http://fotogrph.com/"> Fotogrph</a>. This free template is released under the <a href="http://templated.co/license">Creative Commons Attribution</a> license, so you're pretty much free to do whatever you want with it (even use it commercially) provided you give us credit for it. Have fun :) </p>

    <a href="#" class="button">피젯 등록</a> </div>
</div>


<!-- footer -->
<div id="copyright" class="container">
  <p>&copy; Untitled. All rights reserved. | Photos by <a href="http://fotogrph.com/">Fotogrph</a> | Design by <a href="http://templated.co" rel="nofollow">TEMPLATED</a>.</p>
</div>


</body>
</html>
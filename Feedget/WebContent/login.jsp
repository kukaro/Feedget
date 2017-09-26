<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Feedget에 오신 것을 환영합니다</title>
<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<link href="static/fonts.css" rel="stylesheet" type="text/css" media="all" />
<link href="static/index/css/default.css" rel="stylesheet" type="text/css" media="all" />
<link href="http://fonts.googleapis.com/css?family=Source+Sans+Pro:200,300,400,600,700,900" rel="stylesheet" />
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<style>
.loginForm {
	width: 400px;
	height:430px;
	margin: 40px auto;
	background-color: rgba(100, 100, 100, 1.9);
	overflow: auto;
}
.loginForm h2 {
	color:white;
	text-align:center;
	margin-top:30px;
	margin-bottom:20px;
}
.form-group {
	margin-bottom:40px;
}
#header-featured {
	height:600px;
}

.button {
	width:150px;
	height:30px;
	margin-left:125px;
	font-size:20px;
}

.tagA {
	text-align:center;
	margin-bottom:20px;
	color:white;
}
#line {
	margin:30px;
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

	<div class="loginForm row">
		<h2>LOGIN</h2>
		
		<form class="login-input" method="GET" action="DevLoginController">
  			<div class="form-group col-md-12">
    			<input type="email" class="form-control" id="exampleInputEmail1" name="exampleInputEmail1" placeholder="이메일">
  			</div>
  			<div class="form-group col-md-12">
    			<input type="text" class="form-control" id="exampleInputName" name="exampleInputName" placeholder="이름">
  			</div>
  			<button type="submit" class="button">LOGIN</button>

		</form>
		
		<hr id="line">
		
		<div class="row">
			<a href="#" class="tagA col-md-10">암호를 잊으셨나요?</a>
			<a href="#" class="tagA col-md-10">계정을 생성하시겠습니까?</a>
		
		</div>
	
	</div>


</div>



<!-- footer -->
<div id="copyright" class="container">
  <p>&copy; Untitled. All rights reserved. | Photos by <a href="http://fotogrph.com/">Fotogrph</a> | Design by <a href="http://templated.co" rel="nofollow">TEMPLATED</a>.</p>
</div>


</body>
</html>
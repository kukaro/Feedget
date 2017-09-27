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
<link href="static/index/css/default.css" rel="stylesheet" type="text/css"/>
<link href="static/index/css/index.css" rel="stylesheet" type="text/css"/>
<link href="http://fonts.googleapis.com/css?family=Source+Sans+Pro:200,300,400,600,700,900" rel="stylesheet" />
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<script src="./static/index/js/jquery-3.2.1.js"></script>
<script>
	<%if(session.getAttribute("isLogin")!=null){%>
	$(document).ready(function() {
		$('#header-frame').load('header-login');
	});
	$(document).ready(function() {
		$('#body-frame').load('body-index');
	});
	<%}else{%>
	$(document).ready(function() {
		$('#header-frame').load('header');
	});
	$(document).ready(function() {
		$('#body-frame').load('body-index');
	});
	<%}%>
</script>
</head>
<body>

	<!-- header -->
	<div id="header-frame"></div>
	
	<!-- middle-contents -->
	<div id="body-frame"></div>
	
	<!-- footer -->
	<div id="copyright" class="container">
  		<p>
  			&copy; Untitled. All rights reserved. | Photos by 
  			<a href="http://fotogrph.com/">Fotogrph</a> | Design by 
  			<a href="http://templated.co" rel="nofollow">TEMPLATED</a>.
  		</p>
	</div>
	
</body>
</html>
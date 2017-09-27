<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<link href="static/login/css/login.css" rel="stylesheet" type="text/css" media="all" />
<script src="./static/index/js/jquery-3.2.1.js"></script>
<script>
	function body_join() {
		$('#body-frame').load('body-join');
	}
</script>

<div id="header-featured"> 
	<div class="loginForm row">
		<h2>LOGIN</h2>
		<form class="login-input" method="GET" action="DevLoginController">
  			<div class="form-group form-group-lg col-md-12">
    			<input type="email" class="form-control" id="devEmail" name="devEmail" placeholder="이메일">
  			</div>
  			<div class="form-group  form-group-lg col-md-12">
    			<input type="password" class="form-control" id="devPassword" name="devPassword" placeholder="암호">
  			</div>
  			<button type="submit" class="btn btn-lg btn-block col-lg-2">LOGIN</button>
		</form>

		<div class="row">
			<a href="#" class="tagA col-md-4">암호를 잊으셨나요?</a>
			<a href="#" class="tagA col-md-6" onclick="body_join()">계정을 생성하시겠습니까?</a>
		</div>
	</div>
</div>
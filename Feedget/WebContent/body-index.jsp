<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<style>
#header-featured button {
	background-color:#1B9772;
	color:white;
	margin:40px 0 0 500px;
	width:200px;
	height:50px;
}
</style>
<script>
function register(){
	<%if(session.getAttribute("isLogin")!=null){%>
	$('#body-frame').load('body-register');
	<%}else{%>
	$('#body-frame').load('body-index');
	<%}%>
}
</script>

<div id="header-featured"> 
	<div id="extra" class="container">
    <h2 style="color:white;">2백만여가지의 다양한 컨텐츠를 만나보세요.</h2>
    <span>Quisque dictum integer nisl risus, sagittis convallis, rutrum id, congue, and nibh</span> 
    <p>This is <strong>Breadth</strong>, a free, fully standards-compliant CSS template designed byTEMPLATEDreative Commons Attributilicense, so you're pretty much free to do whatever you want with it (even use it commercially) provided you give us credit for it. Have fun :) </p>

    <button type="submit" class="btn btn-lg btn-block col-lg-2" onclick="register()">피젯 등록</button>
</div>

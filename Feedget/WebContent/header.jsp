<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<style>
.onMouse a {
	background: #197d62;
	color: #FFF !important;
}
.outMouse a {
	background: white;
	color: #212121 !important;
}
</style>

<script src="./static/index/js/jquery-3.2.1.js"></script>
<script>
	function header_mypage() {
		$('#body-frame').load('body-mypage');
	}
	function header_search() {
		$('#body-frame').load('body-search');
	}
	function header_index() {
		$('#body-frame').load('body-index');
	}
	function header_login() {
		$('#body-frame').load('body-login');
	}
	function header_home() {
		$('#body-frame').load('body-index');
	}
</script>
<div id="header-wrapper">
	<div id="header" class="container">
		<div id="logo">
			<h1>
				<a href="#" onclick="header_home()">Feedget</a>
			</h1>
		</div>
		<div id="menu">
      		<ul>
        		<li onMouseOver="this.className='onMouse';" onMouseOut="this.className='outMouse';"><a href="#" accesskey="1" title="" onclick="header_home();">Home</a></li>
        		<li onMouseOver="this.className='onMouse';" onMouseOut="this.className='outMouse';"><a href="#" accesskey="2" title="" onclick="header_search();">Search</a></li>
        		<li onMouseOver="this.className='onMouse';" onMouseOut="this.className='outMouse';"><a href="#" accesskey="3" title="" onclick="header_category();">Category</a></li>
        		<li onMouseOver="this.className='onMouse';" onMouseOut="this.className='outMouse';"><a href="#" accesskey="4" title="" onclick="header_mypage();">Mypage</a></li>
        		<li onMouseOver="this.className='onMouse';" onMouseOut="this.className='outMouse';"><a href="#" accesskey="4" title="" onclick="header_login();">Login</a></li>
      		</ul>
    	</div>
	</div>
    
</div>
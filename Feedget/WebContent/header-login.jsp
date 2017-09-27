<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<script src="./static/index/js/jquery-3.2.1.js"></script>
<script>
	function header_search() {
		$('#body-frame').load('body-search');
	}
	function header_index() {
		$('#body-frame').load('body-index');
	}

</script>
<div id="header-wrapper">
	<div id="header" class="container">
		<div id="logo">
			<h1>
				<a href="#">Feedget</a>
			</h1>
		</div>
		<div id="menu">
			<ul>
				<li class="current_page_item"><a href="#" accesskey="1"
					title="" onclick="header_index()">Home</a></li>
				<li><a href="#" accesskey="2" title="" onclick="header_search();">Search</a></li>
				<li><a href="#" accesskey="3" title="" onclick="header_category();">Category</a></li>
				<li><a href="#" accesskey="4" title="" onclick="header_mypage();">Mypage</a></li>
				<li><a href="/Feedget/controller?action=logout" accesskey="5" title="">Logout</a></li>
			</ul>
		</div>
	</div>
</div>
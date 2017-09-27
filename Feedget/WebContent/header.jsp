<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<style>

</style>
<script src="./static/index/js/jquery-3.2.1.js"></script>
<script>
	function header_search(){
		$('#body-frame').load('body-search');
	}
	function header_index(){
		$('#body-frame').load('body-index');
	}
	function header_login(){
		$('#body-frame').load('body-login');
	}
</script>

    
<div id="header-wrapper">
  <div id="header" class="container">
    <div id="logo">
      <h1><a href="#">Feedget</a></h1>
	</div>
    <div id="menu">
      <ul>
        <li class="current_page_item"><a href="#" accesskey="1" title="">Home</a></li>
        <li><a href="#" accesskey="2" title="" onclick="header_search();">Search</a></li>
        <li><a href="#" accesskey="3" title="" onclick="header_category();">Category</a></li>
        <li><a href="#" accesskey="4" title="" onclick="header_mypage();">Mypage</a></li>
        <li><a href="#" accesskey="4" title="" onclick="header_login();">Login</a></li>
      </ul>
    </div>
  </div>
</div>
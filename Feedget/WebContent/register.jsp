<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Feedget 등록</title>
<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<link href="static/fonts.css" rel="stylesheet" type="text/css" media="all" />
<link href="static/index/css/default.css" rel="stylesheet" type="text/css" media="all" />
<link href="http://fonts.googleapis.com/css?family=Source+Sans+Pro:200,300,400,600,700,900" rel="stylesheet" />
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<script language="javascript">
<!--
var oTbl;
//Row 추가
function insRow() {
  oTbl = document.getElementById("addTable");
  var oRow = oTbl.insertRow();
  oRow.onmouseover=function(){oTbl.clickedRowIndex=this.rowIndex}; //clickedRowIndex - 클릭한 Row의 위치를 확인;
  var oCell = oRow.insertCell();

  //삽입될 Form Tag
  var frmTag = "<input type=text name=addText style=width:350px; height:20px;> ";
  frmTag += "<input type=button value='삭제' onClick='removeRow()' style='cursor:hand'>";
  oCell.innerHTML = frmTag;
}
//Row 삭제
function removeRow() {
  oTbl.deleteRow(oTbl.clickedRowIndex);
}

function frmCheck()
{
  var frm = document.form;
  
  for( var i = 0; i <= frm.elements.length - 1; i++ ){
     if( frm.elements[i].name == "addText" )
     {
         if( !frm.elements[i].value ){
             alert("텍스트박스에 값을 입력하세요!");
                 frm.elements[i].focus();
	 return;
          }
      }
   }
 }
//-->
</script>
<style>
#header-wrapper {
	top:0;
	position:fixed;
	width:100%;
}
#header-featured {
	margin-top:150px;
	height:1000px;
}
#header-featured h3 {
	margin: 30px 0 0 90px;
	color:white;
}
.addText {
	margin:10px 0 0 15px;
}
.register-div {
	height:500px;
	margin: 20px 70px 50px 90px;
}
.registerForm {
	background-color:white;
	padding:50px;
}
.preview {
	height:400px;
	background-color:white;
	margin-left:70px;
}
.form-group button {
	float:right;
	width:80px;
	height:30px;
	font-size:13px;
	margin-right:15px;
	background-color:#1B9772;
	color:white;
}
#feed-layout {
	margin-left:15px;
	margin-top:5px;
}
.addText {
	margin-left:15px;
	width:460px;
	border:1px;
	border-color:red;
	
}
.addText-key {
	width:130px;
	padding:0px 10px 5px 0px;
}
.addText-value {
	width:280px;
	padding:0px 10px 5px 10px;
}
.addText-remove {
	width:50px;
	padding:0px 0px 5px 10px;
}
.addText-remove btn {
	background-color:#1B9772;
	text-align:center;
	font-size:13px;
	color:white;
}
.save {
	width:460px;
	background-color:#1B9772;
	text-align:center;
	color:white;
	margin:40px 10px 0 15px;
}

</style>
</head>
<body>

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



<div id="header-featured"> 

	<h3>피젯 등록</h3>

	<div class="register-div row">
		<div class="registerForm col-md-6">
			<div class="tab-content">
                        <div role="tabpanel" class="tab-pane active" id="home">
                            <form>
                              <div class="form-group">
                                <label for="feedgetName">피젯 이름</label>
                                <input type="text" class="form-control" id="feedgetName" name="feedgetName" placeholder="Feedget Name">
                              </div>
                              <div class="form-group">
                                <label for="description">피젯을 간단하게 소개해주세요.</label>
                                <input type="text" class="form-control" id="description" name="description" placeholder="Feedget Description">
                              </div>
                                <div class="form-group">
                                <label for="developer">등록인</label>
                                <input type="text" class="form-control" id="developer" name="developer" placeholder="Developer">
                              </div>
                              <div class="form-group">
                                <label for="company">개발사</label>
                                <input type="text" class="form-control" id="company" name="company" placeholder="Company">
                              </div>
                              <div class="form-group row">
                                <label id="feed-layout">피젯 레이아웃 정보들을 입력해주세요.</label>
                               	<button type="button" class="btn btn col-lg-2">+텍스트</button>
                               	<button type="button" class="btn btn col-lg-2">+이미지</button>
                                </div>
                               	<div class="row">
                                	<table class="addText">
                                		<tr>
                                			<td class="addText-key">
                                				<input type="text" class="key form-control" id="" placeholder="Text-Key">
                                			</td>
                                			<td class="addText-value">
                                				<input type="text" class="value form-control" id="" placeholder="Text-Value">
                                			</td>
                                			
                                		</tr>
                                	</table>
                                </div>
                                
                                <div class="row">
                                	<table class="addImage">
                                		<tr>
                                			<td class="addText-key">
                                				<input type="text" class="key form-control" id="" placeholder="Text-Key">
                                			</td>
                                			<td class="addText-value">
                                				<input type="text" class="value form-control" id="" placeholder="Text-Value">
                                			</td>
                                			<td class="addText-remove">
                                				<button type="button" class="btn">삭제</button>
                                			</td>
                                		</tr>
                                	</table>
                                </div>
                                
                                <div class="row">
                                	<button type="button" class="save btn btn-lg btn-block col-lg-2">등록하기</button>
                              		
                                </div>
                              
                              	</div>
                              
                              
                            </form>
                        </div>
		
		</div>
		<div class="preview col-md-5">
		 미리보
		</div>
	
	</div>



</div>


<div id="copyright" class="container">
  <p>&copy; Untitled. All rights reserved. | Photos by <a href="http://fotogrph.com/">Fotogrph</a> | Design by <a href="http://templated.co" rel="nofollow">TEMPLATED</a>.</p>
</div>

</body>
</html>
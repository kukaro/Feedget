<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<link href="static/register/css/register.css" rel="stylesheet"
	type="text/css" media="all" />
<script src="./static/index/js/jquery-3.2.1.js"></script>
<script src="./static/register/js/register.js"></script>
<script>
function feedgetKey(event) {
   console.log(event);
}
</script>
<div id="header-featured">

	<h3>피젯 등록</h3>

	<div class="register-div row">
		<div class="registerForm col-md-6">
			<div class="tab-content">
				<div role="tabpanel" class="tab-pane active" id="home">
					<form>
						<div class="form-group">
							<label for="feedgetName">피젯 이름</label> <input type="text"
								class="form-control" id="feedgetName" name="feedgetName"
								placeholder="Feedget Name">
						</div>
						<div class="form-group">
							<label for="developer">피젯 배경</label> <input type="text"
								class="form-control" id="feedgetBg" name="feedgetBg"
								placeholder="레이아웃 배경의 이미지(url)나 색상값(16진수)을 입력하세요.">
						</div>
						<div class="form-group">
							<label for="description">피젯을 간단하게 소개해주세요.</label> <input
								type="text" class="form-control" id="comment" name="comment"
								placeholder="Feedget Description">
						</div>
						<div class="form-group">
							<label id="feed-layout">피젯 레이아웃 정보들을 입력해주세요.</label>
						</div>
				</div>
				</form>

				<div class="buttons row">
					<button type="button" class="btn btn col-lg-2" onclick="addLabel()">+텍스트</button>
					<button type="button" class="btn btn col-lg-2" onclick="addImage()">+이미지</button>
					<button type="button" class="btn" onclick="remove()">삭제</button>
				</div>

				<div class="row">
					<button type="button" class="save btn btn-lg btn-block col-lg-2" onclick="fidgetSubmit()">등록하기</button>
				</div>

			</div>
		</div>

		<div class="preview col-md-5">
			<div class="feed"></div>
		</div>

	</div>

</div>

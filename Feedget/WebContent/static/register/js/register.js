var tagArr = [];
var json = {};
var count = 0;
		function addLabel() {
			var textTag = '<div class="row">\
	<table class="addText">\
	<tr>\
		<td class="addText-key">\
			<label for="company">x-좌표</label>\
		</td>\
		<td class="addText-value">\
			<input type="text" class="value form-control" id="lblX'+count+'" placeholder="레이아웃이 위치될 x좌표값을 입력하세요.">\
		</td>\
	</tr>\
	<tr>\
		<td class="addText-key">\
			<label for="company">y-좌표</label>\
		</td>\
		<td class="addText-value">\
			<input type="text" class="value form-control" id="lblY'+count+'" placeholder="레이아웃이 위치될 x좌표값을 입력하세요.">\
		</td>\
	</tr>\
	<tr>\
		<td class="addText-key">\
			<label for="company">width</label>\
		</td>\
		<td class="addText-value">\
			<input type="text" class="value form-control" id="lblWidth'+count+'" placeholder="레이아웃의 너비를 입력하세요.">\
		</td>\
	</tr>\
	<tr>\
		<td class="addText-key">\
			<label for="company">height</label>\
		</td>\
		<td class="addText-value">\
			<input type="text" class="value form-control" id="lblHeight'+count+'" placeholder="레이아웃의 높이를 입력하세요.">\
		</td>\
	</tr>\
	<tr>\
		<td class="addText-key">\
			<label for="company">text</label>\
		</td>\
		<td class="addText-value">\
			<input type="text" class="value form-control" id="lblText'+count+'" placeholder="레이아웃에 들어갈 내용을 입력하세요.">\
		</td>\
	</tr>\
	<tr>\
		<td class="addText-key">\
			<label for="company">text-color</label>\
		</td>\
		<td class="addText-value">\
			<input type="text" class="value form-control" id="lblColor'+count+'" placeholder="텍스트 레이아웃의 색상값(16진수)을 입력하세요.">\
		</td>\
	</tr>\
</table>\
</div>';
			console.log($('form').html());
			tagArr[count] = textTag;
			$('form').html($('form').html() + textTag);
			json['lblX'+count] = $('#lblX'+count).val();
			json['lblY'+count] = $('#lblY'+count).val();
			json['lblWidth'+count] = $('#lblWidth'+count).val();
			json['lblHeight'+count] = $('#lblHeight'+count).val();
			json['lblText'+count] = $('#lblCompany'+count).val();
			json['lblColor'+count] = $('#lblColor'+count).val();
			count++;
		}
function addImage() {
	var imgTag = '<div class="row">\
	<table class="addImage">\
		<table class="addText">\
			<tr>\
				<td class="addText-key"><label for="company">x-좌표</label>\
				</td>\
				<td class="addText-value"><input type="text"\
					class="value form-control" id="imgX'+count+'"\
					placeholder="이미지가 위치될 x좌표값을 입력하세요."></td>\
			</tr>\
			<tr>\
				<td class="addText-key"><label for="company">y-좌표</label>\
				</td>\
				<td class="addText-value"><input type="text"\
					class="value form-control" id="imgY'+count+'"\
					placeholder="이미지가 위치될 x좌표값을 입력하세요."></td>\
			</tr>\
			<tr>\
				<td class="addText-key"><label for="company">width</label>\
				</td>\
				<td class="addText-value"><input type="text"\
					class="value form-control" id="imgWidth'+count+'"\
					placeholder="이미지의 너비를 입력하세요."></td>\
			</tr>\
			<tr>\
				<td class="addText-key"><label for="company">height</label>\
				</td>\
				<td class="addText-value"><input type="text"\
					class="value form-control" id="imgHeight'+count+'"\
					placeholder="이미지의 너비를 입력하세요."></td>\
			</tr>\
			<tr>\
				<td class="addText-key"><label for="company">image</label>\
				</td>\
				<td class="addText-value"><input type="text"\
					class="value form-control" id="imgData'+count+'"\
					placeholder="이미지 url을 입력하세요."></td>\
			</tr>\
		</table>\
		</div>';
	tagArr[count]=imgTag;
	$('form').html($('form').html() + imgTag);
	json['imgX'+count] = $('#imgY'+count).val();
	json['imgY'+count] = $('#imgY'+count).val();
	json['imgWidth'+count] = $('#imgWidth'+count).val();
	json['imgHeight'+count] = $('#imgHeight'+count).val();
	json['imgData'+count] = $('#imgData'+count).val();
	count++;
}

function remove() {
	var lastTag = tagArr.pop();
	count--;
	var len = lastTag.length;
	$('form').html($('form').html().slice(0, $('form').html().length-len))
}

function fidgetSubmit(){
	var keyArr = Object.keys(json);
	for(var i=0;i<keyArr.length;i++){
		json[keyArr[i]]=$('#'+keyArr[i]).val();
	}
	console.log(json);
	json = $.extend({}, json, {feedgetName:$('#feedgetName').val(),feedgetBg:$('#feedgetBg').val(),comment:$('#comment').val()});
	console.log(json);
	$('body').load('/Feedget/controller?action=registFeedget',json);
}
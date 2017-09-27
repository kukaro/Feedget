var tagArr = [];
var count = 0;
		function addLabel() {
			var textTag = '<div class="row">\
	<table class="addText">\
	<tr>\
		<td class="addText-key">\
			<label for="company">x-좌표</label>\
		</td>\
		<td class="addText-value">\
			<input type="text" class="value form-control" id="" placeholder="레이아웃이 위치될 x좌표값을 입력하세요.">\
		</td>\
	</tr>\
	<tr>\
		<td class="addText-key">\
			<label for="company">y-좌표</label>\
		</td>\
		<td class="addText-value">\
			<input type="text" class="value form-control" id="" placeholder="레이아웃이 위치될 x좌표값을 입력하세요.">\
		</td>\
	</tr>\
	<tr>\
		<td class="addText-key">\
			<label for="company">width</label>\
		</td>\
		<td class="addText-value">\
			<input type="text" class="value form-control" id="" placeholder="레이아웃의 너비를 입력하세요.">\
		</td>\
	</tr>\
	<tr>\
		<td class="addText-key">\
			<label for="company">height</label>\
		</td>\
		<td class="addText-value">\
			<input type="text" class="value form-control" id="" placeholder="레이아웃의 너비를 입력하세요.">\
		</td>\
	</tr>\
	<tr>\
		<td class="addText-key">\
			<label for="company">text</label>\
		</td>\
		<td class="addText-value">\
			<input type="text" class="value form-control" id="" placeholder="레이아웃에 들어갈 내용을 입력하세요.">\
		</td>\
	</tr>\
	<tr>\
		<td class="addText-key">\
			<label for="company">text-color</label>\
		</td>\
		<td class="addText-value">\
			<input type="text" class="value form-control" id="" placeholder="텍스트 레이아웃의 색상값(16진수)을 입력하세요.">\
		</td>\
	</tr>\
</table>\
</div>';
			console.log($('form').html());
			tagArr[count] = textTag;
			count++;
			$('form').html($('form').html() + textTag);
		}
function addImage() {
	var imgTag = '<div class="row">\
	<table class="addImage">\
		<table class="addText">\
			<tr>\
				<td class="addText-key"><label for="company">x-좌표</label>\
				</td>\
				<td class="addText-value"><input type="text"\
					class="value form-control" id=""\
					placeholder="이미지가 위치될 x좌표값을 입력하세요."></td>\
			</tr>\
			<tr>\
				<td class="addText-key"><label for="company">y-좌표</label>\
				</td>\
				<td class="addText-value"><input type="text"\
					class="value form-control" id=""\
					placeholder="이미지가 위치될 x좌표값을 입력하세요."></td>\
			</tr>\
			<tr>\
				<td class="addText-key"><label for="company">width</label>\
				</td>\
				<td class="addText-value"><input type="text"\
					class="value form-control" id=""\
					placeholder="이미지의 너비를 입력하세요."></td>\
			</tr>\
			<tr>\
				<td class="addText-key"><label for="company">height</label>\
				</td>\
				<td class="addText-value"><input type="text"\
					class="value form-control" id=""\
					placeholder="이미지의 너비를 입력하세요."></td>\
			</tr>\
			<tr>\
				<td class="addText-key"><label for="company">image</label>\
				</td>\
				<td class="addText-value"><input type="text"\
					class="value form-control" id=""\
					placeholder="이미지 url을 입력하세요."></td>\
			</tr>\
		</table>\
		</div>';
	tagArr[count]=imgTag;
	count++;
	$('form').html($('form').html() + imgTag);
}

function remove() {
	var lastTag = tagArr.pop();
	count--;
	var len = lastTag.length;
	$('form').html($('form').html().slice(0, $('form').html().length-len))
}
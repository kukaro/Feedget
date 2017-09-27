
		function addLabel() {
			var str = '<div class="row">\
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
			$('form').html($('form').html() + str);
		}
function addImage() {
	var str = '<div class="row">\
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
	$('form').html($('form').html() + str);
}

function remove() {
	var str1 = '<div class="row">\
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
	var str2 = '<div class="row">\
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
	
	$('form').html($('form').html() + str);
}
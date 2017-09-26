/**
 * ȸ�� ����
 */
package model.dto;

import java.util.ArrayList;

public class FeedgetDto {
	
	private String email;
	private int color;
	private Data data;
	private String name;
	private String img,comment;
	
	public FeedgetDto(String email, String name, String img, String comment, int color, Data data) {
		super();
		this.email = email;
		this.name = name;
		this.img = img;
		this.comment = comment;
		this.color = color;
		this.data = data;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	
	public String getName() {
		return name;
	}

	public String getImg() {
		return img;
	}

	public int getColor() {
		return color;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

}

class Data {
	private ArrayList<Label> arrLabel;
	private ArrayList<Image> arrImage;
	
	public Data(ArrayList<Label> arrayLabel,ArrayList<Image> arrayImage){
		this.arrImage = arrayImage;
		this.arrLabel = arrayLabel;
	}
	
	public ArrayList<Label> getArrLabel() {
		return arrLabel;
	}
	public void setArrLabel(ArrayList<Label> arrLabel) {
		this.arrLabel = arrLabel;
	}
	public ArrayList<Image> getArrImage() {
		return arrImage;
	}
	public void setArrImage(ArrayList<Image> arrImage) {
		this.arrImage = arrImage;
	}
}

class Label {
	private String text;
	private int x, y, width, height, color;
	
	public Label(String text, int x, int y, int width, int height, int color) {
		this.text = text;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.color = color;
	}
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getColor() {
		return color;
	}
	public void setColor(int color) {
		this.color = color;
	}
	
}

class Image {
	private String data;
	private int x, y, width, height;
	
	public Image(String data, int x, int y, int width, int height) {
		super();
		this.data = data;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	
}

package com.olymtech.git;

public class Mouse {
	private String type;
	private String color;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public void toString(String str){
		System.out.println(this.color);
		System.out.println(this.type);
		System.out.println(str+"==color:"+this.color+"==type:"+this.type);
	}
}

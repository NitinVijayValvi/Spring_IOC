package com.yash.springioc4;

public class SetterMessage {

	private int id;
	private String msg;
	public void setId(int id) {
		this.id = id;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public void display() {
		System.out.println("Setter message called");
		
		System.out.println(id+  "  " +msg);
	}
}

package com.example.form;

public class Ex03ReceiveForm {

	private String item1;
	private String item2;
	private String item3;
	
	public int getIntItem1() {
		return Integer.parseInt(item1);
	}
	
	public int getIntItem2() {
		return Integer.parseInt(item2);
	}
	
	public int getIntItem3() {
		return Integer.parseInt(item3);
	}

	public String getItem1() {
		return item1;
	}

	public void setItem1(String item1) {
		this.item1 = item1;
	}

	public String getItem2() {
		return item2;
	}

	public void setItem2(String item2) {
		this.item2 = item2;
	}

	public String getItem3() {
		return item3;
	}

	public void setItem3(String item3) {
		this.item3 = item3;
	}

}

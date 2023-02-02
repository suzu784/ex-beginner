package com.example.form;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class UserForm {

	@NotBlank(message="名前を入力してください")
	private String name;
	
	@NotBlank(message="年齢を入力してください")
	private String age;
	@NotNull(message="コメントを入力してください")
	private String comment;

	public int getIntAge() {
		return Integer.parseInt(age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
}

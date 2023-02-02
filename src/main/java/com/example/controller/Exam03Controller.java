package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.form.Ex03ReceiveForm;

import jakarta.servlet.ServletContext;

@Controller
@RequestMapping("/exam03")
public class Exam03Controller {

	@Autowired
	private ServletContext application;

	@GetMapping("")
	public String index() {
		return "exam03";
	}

	@PostMapping("/item-total-price")
	public String itemTotal(Ex03ReceiveForm receiveForm) {

		int item1 = receiveForm.getIntItem1();
		int item2 = receiveForm.getIntItem2();
		int item3 = receiveForm.getIntItem3();
		int total = item1 + item2 + item3;
		Double totalIncludeTax = (item1 + item2 + item3) * 1.1;

		application.setAttribute("total", total);
		application.setAttribute("totalIncludeTax", totalIncludeTax);

		return "exam03-result";
	}
}

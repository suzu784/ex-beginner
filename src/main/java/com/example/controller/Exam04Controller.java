package com.example.controller;


import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.domain.User;
import com.example.form.UserForm;

@Controller
@RequestMapping("/exam04")
public class Exam04Controller {

	@GetMapping("")
	public String index(Model model, UserForm userForm) {
		return "exam04";
	}
	
	@PostMapping("/submit")
	public String submit(
			@Validated UserForm userForm
			, BindingResult result
			, RedirectAttributes redirectAttributes
			, Model model
			) {
		if(result.hasErrors()) {
			return index(model, userForm);
		}
		
		User user = new User();
		user.setAge(userForm.getIntAge());
		BeanUtils.copyProperties(userForm, user);
		model.addAttribute("user", user);
		
		return "exam04-result";
	}
}

package com.org.xworkz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.org.xworkz.dto.SignInDTO;
import com.org.xworkz.ser.SignInService;

@Controller
@RequestMapping
public class SignInController {
	@Autowired
	private SignInService signinservice;
	public SignInController() {
		System.out.println("createdd" + this.getClass().getSimpleName());
	}

	@RequestMapping("/pro.do")
	public String onSubmit(SignInDTO signindto, ModelMap map) {
		try {
			System.out.println("invoked onSignup");
			boolean check = this.signinservice.validateAndSave(signindto);
			if (check) {
				map.addAttribute("SignIn.jsp", "Data saved");
			} else {
				map.addAttribute("SignIn.jsp", "Data not saved");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		return "/SignIn.jsp";

	}

}

package com.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/login")
	public String login(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		String user_name = request.getParameter("user_name");
		String password = request.getParameter("password");
		System.out.println(user_name + password);
		Map<String, String> param = new HashMap<String, String>();
		param.put("name", "郅士奇");
		return "redirect:/mandate/mandateList";
	}
}

package com.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/mandate")
public class ManDateController {
	@RequestMapping("/mandateList")
	public ModelAndView mandateList() {
		String hello = "nihaoa,wohenhao";
		Map<String, String> param = new HashMap<String, String>();
		param.put("name", hello);
		return new ModelAndView("mandate", param);

	}

	public ModelAndView index() {
		Map<String, String> param = new HashMap<String, String>();
		param.put("name", "郅士奇");
		return new ModelAndView("index", param);
	}
}

package com;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Hello {
	// @RequestMapping(value = "/say")
	// @ResponseBody
	// public String say(HttpServletRequest request, HttpServletResponse
	// response, HttpSession session) {
	// System.out.println("say"+request.getParameter("hello"));
	// return request.getParameter("hello")+"郅士奇";
	// }
	//
	// @RequestMapping("/index")
	// public ModelAndView index(){
	// Map<String, String> param=new HashMap<String,String>();
	// param.put("name", "郅士奇");
	// return new ModelAndView("index",param);
	// }
	// @RequestMapping("/")
	// public ModelAndView index1(){
	// ModelAndView mav=new ModelAndView("login");
	// return mav;
	// }
}

package com;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class Hello {
	
    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }
    
    @RequestMapping("/say_hello")
    @ResponseBody
    String say_hello(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
    	System.out.println("say"+request.getParameter("hello"));
        return request.getParameter("hello");
    }
    @RequestMapping("/say")
    @ResponseBody
    String say(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
    	System.out.println("say"+request.getParameter("hello"));
        return request.getParameter("hello");
    }
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Hello.class, args);
    }
}
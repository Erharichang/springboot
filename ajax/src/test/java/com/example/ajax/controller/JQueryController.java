package com.example.ajax.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/jquery/")
public class JQueryController {
	@RequestMapping("doAjaxGet")
	@ResponseBody
	public String doAjaxGet(String msg) {
		if(Math.random()>0.1) {
			throw new IllegalArgumentException("参数异常");
		}
		//将客户端传到服务端的字符换转换为大写,然后再响应给客户端.
		return "Jquery Get request result "+msg.toUpperCase();
	}
	@RequestMapping("doAjaxPost")
	@ResponseBody
	public String doAjaxPost(Integer id,String title) {
		//将客户端传到服务端的字符换转换为大写,然后再响应给客户端.
		return "Jquery Post request result "+id+"/"+title;
	}
	
	@RequestMapping("doAxiosPost")
	@ResponseBody
	public String doAxiosPost(@RequestBody Message msg) {
		return msg.toString();
	}
	
	
}

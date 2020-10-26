package com.example.ajax.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class AjaxController {
	
	
	private List<String> container=new ArrayList<>();
	
	@RequestMapping("doCheck")
	@ResponseBody
	public String doCheck(String name) {
		if(container.contains(name))
			return name+"已存在,请换个名字";
		return name +"不存在,可以注册";
	}
	
	@RequestMapping("doSave")
	@ResponseBody
	public String doSave(String name) {//方法参数名和客户端请求参数名相同
		container.add(name);//后续这个值可以存储到数据库
		return name+" save ok";
	}
	
	@RequestMapping("doAjaxGet")
	@ResponseBody //告诉spring mvc 此方法的返回值不是viewname,可以将其看成是普通字符串
	public String doAjaxGet()throws Exception {
		//Thread.sleep(5000);
		return "Ajax Get Request Result";
	}
	
}

package com.example.ajax.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: 晓白
 * @time: 2020/10/19 15:44
 * @description:
 */
@Controller
@RequestMapping("/")
public class AjaxController {
    @RequestMapping("ajaxUI")
    public String Ajax(){
        return "ajax-2";
    }
    //处理异步请求
    @RequestMapping("doGet")
    public @ResponseBody
    String doGet(){
        return "Get Ajax";
    }
    @RequestMapping("doSave")
    public @ResponseBody
    String doSave(String name){
        names.add(name);
        return  "save ok";
    }

    private List<String> names = new ArrayList();
    @RequestMapping("doCheck")
    public @ResponseBody String doCheck(String name){
            if(names.contains(name)){
                return "name:"+name+"存在";
            }
        return "name:"+name+"不存在";
    }

}

package com.example.controller;

import com.example.pojo.Goods;
import com.example.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.reflect.Modifier;
import java.util.List;

/**
 * @author: 晓白
 * @time: 2020/10/14 11:28
 * @description:
 */
@Controller
public class GoodsController {
    @Autowired
    private GoodsService goodsService;
    @RequestMapping("/spring/say")
    public String app(Model model){
        List<Goods> list = goodsService.selectGoods();
        model.addAttribute("list",list);
        return "goods";
    }
    @RequestMapping("/spring/dele/{id}")
    public String delect(@PathVariable Integer id){
         goodsService.delectId(id);
         return "redirect:/spring/say";
    }
    @RequestMapping("/spring/add")
    public String insert(Goods goods){
        goodsService.insertGoods(goods);
        return "redirect:/spring/say";
    }
    @RequestMapping("/spring/in")
    public String doGoodsAddUI() {
        return "goods-add";
    }


}

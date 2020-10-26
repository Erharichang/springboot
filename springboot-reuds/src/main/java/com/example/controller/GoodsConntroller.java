package com.example.controller;

import com.example.pojo.Goods;
import com.example.service.GoodsService;
import com.example.service.impl.GoodsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author: 晓白
 * @time: 2020/10/15 10:07
 * @description:
 */
@Controller
@RequestMapping("/spring/")
public class GoodsConntroller {
    @Autowired
    private GoodsService goodsService;
    @RequestMapping("selectUI")
    public String selectUI(Model model){
        List<Goods> list = goodsService.selectAll();
        model.addAttribute("list",list);
        return "goods";
    }

    @RequestMapping("deleteUI")
    public String delectUI(Integer id) {
        goodsService.deleteId(id);
        return "redirect:selectUI";
    }

    @RequestMapping("insertUI")
    public String insertUI(){

        return "goods-add";
    }

    @RequestMapping("insert")
    public String insert(Goods goods){
        goodsService.insertDate(goods);
        return "redirect:selectUI";
    }

    @RequestMapping("updateUI")
    public String updateUI(Integer id,Model model) {
        Goods goods = goodsService.selectId(id);
        model.addAttribute("goods",goods);
        return "goods-up";
    }

    @RequestMapping("update")
    public String updateUI(Goods goods) {
        goodsService.updateId(goods);
        return "redirect:selectUI";
    }
}

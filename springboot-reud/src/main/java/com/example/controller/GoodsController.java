package com.example.controller;

import com.example.pojo.Goods;
import com.example.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author: 晓白
 * @time: 2020/10/14 23:52
 * @description:
 */
@Controller
@RequestMapping("/spring/")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;
    @RequestMapping("selectUI")
    public String selectUI(Model model){
        List<Goods> list =  goodsService.selectAll();
        model.addAttribute("list",list);
        return "goods";
    }

    @RequestMapping("deleteUI/{id}")
    public String deleteUI(@PathVariable Integer id){
       goodsService.deleteId(id);
        return "redirect:/spring/selectUI";
    }

    @RequestMapping("insertUI")
    public String insertUI(){
//        goodsService.insertDate(goods);
        return "goods-add";
    }

    @RequestMapping("insert")
    public String insert(Goods goods){
        goodsService.insertDate(goods);
        return "redirect:/spring/selectUI";
    }

    @RequestMapping("updateUI/{id}")
    public String updateUI(@PathVariable Integer id, Model model){
        Goods good =  goodsService.selectId(id);
        model.addAttribute("p",good);
        return "goods-up";
    }

    @RequestMapping("update")
    public String update(Goods goods){
        goodsService.updateId(goods);
        return "redirect:/spring/selectUI";
    }
}

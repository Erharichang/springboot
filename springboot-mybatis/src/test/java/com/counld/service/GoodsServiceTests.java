package com.counld.service;

import com.counld.pojo.Goods;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author: 晓白
 * @time: 2020/10/13 15:10
 * @description:
 */
@SpringBootTest
public class GoodsServiceTests {
    @Autowired
    private GoodsService goodsService;
    @Test
    void testService(){
        int rows = goodsService.deleteById(13);
        System.out.println("rows="+rows);
    }
    @Test
    void testSelect(){
        Goods goods = goodsService.selectById(1);
        System.out.println(goods);
    }
    @Test
    void testSelectFind(){
        List<Goods> goodsList = goodsService.selectFind();
        goodsList = goodsService.selectFind();
        for (Goods goods : goodsList) {
            System.out.println(goods);
        }
    }
}

package com.example;

import com.example.pojo.Goods;
import com.example.service.GoodsService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootReudsApplicationTests {
    @Autowired
    private GoodsService goodsService;
    @Test
    void contextLoads() {
        List<Goods> list = goodsService.selectAll();
        System.out.println(list);
    }

}

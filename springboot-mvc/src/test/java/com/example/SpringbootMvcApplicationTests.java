package com.example;

import com.example.pojo.Goods;
import com.example.service.GoodsService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootMvcApplicationTests {
    @Autowired
    private GoodsService goodsService;
    @Test
    void contextLoads() {
        int rows =goodsService.delectId(13);
        System.out.println(rows);
    }

}

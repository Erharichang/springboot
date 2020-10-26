package com.counld.dao;

import com.counld.dao.GoodsDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

/**
 * @author: 晓白
 * @time: 2020/10/13 1:02
 * @description:
 */
@SpringBootTest
public class GoodsDaoTests {
    @Autowired
    private GoodsDao goodsDao;

    @Test
    void testDelectObject(){
        int rows = goodsDao.delectObject(13,14);
        System.out.println(rows);
    }


}

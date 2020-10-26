package com.counld.service;

import com.counld.pojo.Goods;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author: 晓白
 * @time: 2020/10/13 15:10
 * @description:
 */
//@Component
public interface GoodsService {

    int deleteById(Integer id);

    Goods selectById(Integer id);

    List<Goods> selectFind();
}

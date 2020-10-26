package com.example.service;

import com.example.pojo.Goods;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author: 晓白
 * @time: 2020/10/14 11:09
 * @description:
 */
public interface GoodsService {
    List<Goods> selectGoods();

    int delectId(Integer id);

    int insertGoods(Goods goods);
}

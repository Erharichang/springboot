package com.example.service.impl;

import com.example.dao.GoodsDao;
import com.example.pojo.Goods;
import com.example.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: 晓白
 * @time: 2020/10/14 11:10
 * @description:
 */
@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsDao goodsDao;
    @Override
    public List<Goods> selectGoods() {
        List<Goods> list = goodsDao.selectGoods();
        return list;
    }

    @Override
    public int delectId(Integer id) {

        return goodsDao.delectId(id);
    }

    @Override
    public int insertGoods(Goods goods) {

        return goodsDao.insertGoods(goods);
    }
}

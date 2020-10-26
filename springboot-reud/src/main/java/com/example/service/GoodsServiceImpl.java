package com.example.service;

import com.example.dao.GoodsDao;
import com.example.pojo.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author: 晓白
 * @time: 2020/10/14 23:29
 * @description:
 */
@Service
public class GoodsServiceImpl implements GoodsService{
    @Autowired
    private GoodsDao goodsDao;

    @Override
    public List<Goods> selectAll() {

        return goodsDao.selectAll();
    }

    @Override
    public int deleteId(Integer id) {

        return goodsDao.deleteId(id);
    }


    @Override
    public int insertDate(Goods goods) {
        goods.setCreatedTime(new Date());
        return goodsDao.insertDate(goods);
    }

    @Override
    public int updateId(Goods goods) {

        return goodsDao.updateId(goods);
    }

    @Override
    public Goods selectId(Integer id) {

        return goodsDao.selectId(id);
    }
}

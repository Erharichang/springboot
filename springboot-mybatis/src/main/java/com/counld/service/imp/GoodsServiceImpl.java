package com.counld.service.imp;

import com.counld.dao.GoodsDao;
import com.counld.pojo.Goods;
import com.counld.service.GoodsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: 晓白
 * @time: 2020/10/13 15:10
 * @description:
 */
@Service
public class GoodsServiceImpl implements GoodsService {
    private static final Logger logger = LoggerFactory.getLogger(GoodsServiceImpl.class);
    @Autowired
    private GoodsDao goodsDao;
    @Override
    public int deleteById(Integer id) {
        Long t1 = System.currentTimeMillis();
        int rows = goodsDao.deleteById(id);
        Long t2 = System.currentTimeMillis();
        System.out.println(logger.getClass().getName());
        System.out.println(t2-t1);
        return rows;
    }

    @Override
    public Goods selectById(Integer id) {
        Long t1 = System.currentTimeMillis();
        Goods goods = goodsDao.selectById(id);
        Long t2 = System.currentTimeMillis();
        System.out.println(t2-t1);
        return goods;
    }

    @Override
    public List<Goods> selectFind() {
        Long t1 = System.currentTimeMillis();
        List<Goods> list = goodsDao.selectFind();
        Long t2 = System.currentTimeMillis();
        System.out.println(t2-t1);
        return list;
    }
}

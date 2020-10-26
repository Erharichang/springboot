package com.example.service;

import com.example.pojo.Goods;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface GoodsService {
    //查询全部数据库
    List<Goods> selectAll();
    //根据id删除数据
    int deleteId(Integer id);
    //插入数据
    int insertDate(Goods goods);
    //更新数据
    int  updateId(Goods goods);

    Goods selectId(Integer id);
}

package com.example.service;

import com.example.pojo.Goods;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface GoodsService {
    List<Goods> selectAll();

    int deleteId(Integer id);

    int insertDate(Goods goods);

    int  updateId(Goods goods);

    Goods selectId(Integer id);
}

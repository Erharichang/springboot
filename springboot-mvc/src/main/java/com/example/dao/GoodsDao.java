package com.example.dao;

import com.example.pojo.Goods;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface GoodsDao {
    @Select("select * from tb_goods")
    List<Goods> selectGoods();

    @Delete("delete from tb_goods where id=#{id}")
    int delectId(Integer id);

    @Insert("insert into tb_goods(name,remark,createdTime) values (#{name},#{remark},now())")
    int insertGoods(Goods goods);
}

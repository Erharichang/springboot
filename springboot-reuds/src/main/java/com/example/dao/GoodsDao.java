package com.example.dao;

import com.example.pojo.Goods;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author: 晓白
 * @time: 2020/10/15 9:49
 * @description:
 */
@Mapper
public interface GoodsDao {
    @Select("select * from tb_goods")
    List<Goods> selectAll();

    @Delete("delete from tb_goods where id = #{id} ")
    int deleteId(Integer id);

    @Insert("insert into tb_goods(name,remark,createdTime) values (#{name},#{remark},now())")
    int insertDate(Goods goods);

    @Update("update tb_goods set name=#{name},remark=#{remark} where id=#{id}")
    int  updateId(Goods goods);

    @Select("select * from tb_goods where id=#{id}")
    Goods selectId(Integer id);
}

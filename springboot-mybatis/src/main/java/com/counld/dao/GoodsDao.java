package com.counld.dao;

import com.counld.pojo.Goods;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Mapper
/**
 * @Mapper 用于描述(标记)数据层访问接口, 用于告诉mybatis框架
 * 使用此注解描述的接口要由底层为其创建实现类.在实现类中基于mybatis
 * API实现与数据库的交互.这个类交给spring管理
 */

public interface GoodsDao {
    /**
     * 查询指定的数据的行数
     *
     * @param id 商品的id
     * @return int 查询数据的行数
     */
    @Delete("delete from tb_goods where id = #{id}")
    int deleteById(Integer id);

    @Select("select * from tb_goods where id=#{id}")
    Goods selectById(Integer id);

    @Select("select * from tb_goods")
    List<Goods> selectFind();

    int delectObject(@Param("ids") Integer... ids);
}

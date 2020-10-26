package com.cy.sys.dao;

import com.cy.sys.pojo.SysLog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author: 晓白
 * @time: 2020/10/24 0:49
 * @description:
 */
@Mapper
public interface SysLogDao {

  int getRowCount(@Param("username") String username);


  List<SysLog> findPageObjects(
          @Param("username")String  username,
          @Param("startIndex")Integer startIndex,
          @Param("pageSize")Integer pageSize);

}

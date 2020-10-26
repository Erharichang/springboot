package com.example.dao;

import com.example.pojo.Activity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author: 晓白
 * @time: 2020/10/16 19:55
 * @description:
 */
@Mapper
public interface ActivityDao {
    /**
     * 修改活动信息
     * @param id
     * @return
     */
    @Update("update tb_activity set state=0 where id=#{id}")
    int updateState(Integer id);

    @Select("select * from tb_activity")
    List<Activity> findActivities();

//    @Insert("insert into tb_activity (title,category,startTime,endTime,remark,state,createdTime,createdUser)values (#{title} ,#{category} ,#{startTime} ,#{endTime} ,#{remark} ,#{state} ,now(),#{createdUser})")
    int insertData(Activity activity);
}

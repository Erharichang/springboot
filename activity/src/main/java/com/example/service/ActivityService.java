package com.example.service;

import com.example.pojo.Activity;
import java.util.List;

/**
 * @author: 晓白
 * @time: 2020/10/16 19:56
 * @description:
 */


public interface ActivityService {
//  int updateState(Integer id);

  List<Activity> findActivities();


  int insertData(Activity activity);
}

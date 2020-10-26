package com.example.service.impl;

import com.example.dao.ActivityDao;
import com.example.pojo.Activity;
import com.example.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author: 晓白
 * @time: 2020/10/16 19:56
 * @description:
 */
@Service
public class ActivityServiceImpl implements ActivityService {
    @Autowired
    private ActivityDao activityDao;



    @Override
    public List<Activity> findActivities() {
        //将来要进行缓存设计
        return activityDao.findActivities();
    }

    /**
     *
     * @param activity
     * @return
     */
    @Override
    public int insertData(Activity activity) {
//        System.out.println("===================="+activity);


        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                activityDao.updateState(activity.getId());
                this.cancel();
            }
        },activity.getEndTime());
        return activityDao.insertData(activity);
    }
}

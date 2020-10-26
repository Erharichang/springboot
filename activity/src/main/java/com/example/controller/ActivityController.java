package com.example.controller;

import com.example.pojo.Activity;
import com.example.service.ActivityService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @author: 晓白
 * @time: 2020/10/16 19:56
 * @description:
 */
@Slf4j
@Controller
@RequestMapping("/")
public class ActivityController {
  @Autowired
    private ActivityService activityService;

  @RequestMapping("activityUI")
    public String activityUI() {
//        model.addAttribute("activity", activityController.activity());
        return "activity-01";
    }

    @RequestMapping("activity")
    public @ResponseBody
    List<Activity> activity() {

    return activityService.findActivities();
    }


    //数据插入
    @RequestMapping("insert")
    public @ResponseBody String insertUI(Activity activity){
        activityService.insertData(activity);
//        System.out.println(activity);

        return "save ok";

    }



  @RequestMapping("test")
  public  String ts() {
//    activityService.insertData(activity);
//        System.out.println(activity);

    return "test";

  }

}
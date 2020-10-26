package com.cy.sys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: 晓白
 * @time: 2020/10/23 17:45
 * @description:
 */
@Controller
public class PageController {
  @RequestMapping("doIndexUI")
  public String doIndexUI() {
    return "starter";
  }

  @RequestMapping("log/log_list")
  public String doLogUI() {
    return "sys/log_list";
  }

  @RequestMapping("doPageUI")
  public String doPageUI() {
    return "common/page";
  }



}

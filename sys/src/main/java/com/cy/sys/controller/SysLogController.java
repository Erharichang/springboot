package com.cy.sys.controller;

import com.cy.sys.pojo.JsonResult;
import com.cy.sys.pojo.PageObject;
import com.cy.sys.pojo.SysLog;
import com.cy.sys.service.SysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author: 晓白
 * @time: 2020/10/24 0:55
 * @description:
 */
@Controller
@RequestMapping("/log/")
public class SysLogController {

  @Autowired
  private SysLogService sysLogService;

  @RequestMapping("doFindPageObjects")
  @ResponseBody
  public JsonResult doFindPageObjects(String username, Integer pageCurrent){
	PageObject<SysLog> pageObject=
			sysLogService.findPageObjects(username,pageCurrent);
	return new JsonResult(pageObject);
  }

}


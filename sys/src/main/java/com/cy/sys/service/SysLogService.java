package com.cy.sys.service;

import com.cy.sys.pojo.PageObject;
import com.cy.sys.pojo.SysLog;

import java.util.List;

public interface SysLogService {

  PageObject<SysLog> findPageObjects(
          String name,
          Integer pageCurrent);
}



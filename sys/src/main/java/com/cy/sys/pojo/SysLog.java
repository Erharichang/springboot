package com.cy.sys.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @author: 晓白
 * @time: 2020/10/24 0:43
 * @description:
 */
@Data
public class SysLog {
  private Integer id;
  private String username;
  private String operation;
  private String method;
  private String params;
  private Integer time;
  private String ip;
  private Date createdTime;

}

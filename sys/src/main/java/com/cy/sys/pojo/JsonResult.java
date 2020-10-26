package com.cy.sys.pojo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author: 晓白
 * @time: 2020/10/24 2:39
 * @description:
 */
@Getter
@Setter

public class JsonResult implements Serializable {
  private static final long serialVersionUID = -856924038217431339L;
  //SysResult/Result/R
  /**
   * 状态码
   */
  private int state = 1;
  //1表示SUCCESS,0表示ERROR
  /**
   * 状态信息
   */
  private String message = "ok";
  /**
   * 正确数据
   */
  private Object data;

  public JsonResult() {
  }

  public JsonResult(String message) {
	this.message = message;
  }

  /**
   * 一般查询时调用，封装查询结果
   */
  public JsonResult(Object data) {
	this.data = data;
  }

  /**
   * 出现异常时时调用
   */
  public JsonResult(Throwable t) {
	this.state = 0;
	this.message = t.getMessage();
  }
}

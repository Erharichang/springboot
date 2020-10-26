package com.cy.sys.pojo;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: 晓白
 * @time: 2020/10/24 2:44
 * @description:
 */

/**
 * 全局的异常处理类,在此类中可以定义异常处理方法
 */
@ControllerAdvice
public class GlobalExceptionHandler {
  /**
   * @ExceptionHandler:此注解描述的方法为一个异常处理方法
   * @param e	用于接收出现的异常
   * @return
   */
  @ExceptionHandler(RuntimeException.class)
  @ResponseBody
  public JsonResult doHandleRuntimeException(RuntimeException e){
	e.printStackTrace();
	//也可以写日志异常信息
	return new JsonResult(e);
	//封装

  }
}



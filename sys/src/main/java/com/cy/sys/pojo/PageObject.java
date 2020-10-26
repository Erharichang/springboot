package com.cy.sys.pojo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

/**
 * @author: 晓白
 * @time: 2020/10/24 2:03
 * @description:
 */
@Getter
@Setter
public class PageObject<T> implements Serializable {
  private static final long serialVersionUID = 6780580291247550747L;
  /**
   * 当前页的页码值
   */
  private Integer pageCurrent = 1;
  /**
   * 页面大小
   */
  private Integer pageSize = 3;
  /**
   * 总行数(通过查询获得)
   */
  private Integer rowCount = 0;
  /**
   * 总页数(通过计算获得)
   */
  private Integer pageCount = 0;
  /**
   * 当前页记录
   */
  private List<T> records;

  public PageObject() {
  }

  public PageObject(Integer pageCurrent, Integer pageSize, Integer rowCount, List<T> records) {
    super();
    this.pageCurrent = pageCurrent;
    this.pageSize = pageSize;
    this.rowCount = rowCount;
    this.records = records;
//		this.pageCount=rowCount/pageSize;
//		if(rowCount%pageSize!=0) {
//			pageCount++;
//		}
    this.pageCount = (rowCount - 1) / pageSize + 1;
  }
}



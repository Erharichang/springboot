package com.cy.sys;

import com.cy.sys.dao.SysLogDao;
import com.cy.sys.pojo.PageObject;
import com.cy.sys.pojo.SysLog;
import com.cy.sys.service.SysLogService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SysApplicationTests {
	@Autowired
	private SysLogDao sysLogDao;
	@Autowired
	private SysLogService sysLogService;


  @Test
  public void FindPageObjects() {
	PageObject<SysLog> pageObject=
			sysLogService.findPageObjects("admin", 1);
	System.out.println(pageObject);

  }

  @Test
	public void testGetRowCount() {
		int rows=sysLogDao.getRowCount("admin");
		System.out.println("rows="+rows);
	}
	@Test
	public void testFindPageObjects() {
		List<SysLog> list=
						sysLogDao.findPageObjects("admin", 0, 3);
		for(SysLog log:list) {
			System.out.println(log);
		}
	}


		}

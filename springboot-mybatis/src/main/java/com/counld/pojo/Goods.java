package com.counld.pojo;

import lombok.Data;
import java.util.Date;

/**
 * @author: 晓白
 * @time: 2020/10/13 16:40
 * @description:
 */
@Data
public class Goods {
    private Integer id;
    private String name;
    private String remark;
    private Date createdTime;
}

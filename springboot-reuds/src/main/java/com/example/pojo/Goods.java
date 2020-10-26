package com.example.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @author: 晓白
 * @time: 2020/10/15 9:48
 * @description:
 */
@Data
public class Goods {
    private Integer id;
    private String name;
    private String remark;
    private Date createdTime;
}

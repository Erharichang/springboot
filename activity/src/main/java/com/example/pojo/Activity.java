package com.example.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: 晓白
 * @time: 2020/10/16 19:48
 * @description:
 */
@Data
public class Activity implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String title;
    private String category;
    //@JsonFormat 告诉spring mvc 转换 json时,将日期按照指定格式进行转换
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm",timezone = "GMT+8")
    private Date startTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm",timezone = "GMT+8")
    private Date endTime;
    private String remark;
    private Integer state=1;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm",timezone = "GMT+8")
    private Date createdTime;
    private String createdUser;

}

package com.learning.springboot.springbootweb.vo.request;

import lombok.Data;

/**
 * @description: demo请求
 * @author: sunfeifei
 * @create: 2019-09-24 18:20
 **/
@Data
public class DemoRequest {
    private String name;
    private Integer age;
    private Long time;
}

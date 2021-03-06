package com.o0u0o.house.api.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author aiuiot
 * @Date 2020/6/8 5:42 下午
 * @Descripton: 经纪人实体类
 **/
@Data
public class Agency implements Serializable {

    private static final long serialVersionUID = -5762809463541541158L;

    private Integer id;

    private String  name;

    private String  address;

    private String  phone;

    private String  email;

    private String  aboutUs;

    private String  webSite;

    private String  mobile;


}

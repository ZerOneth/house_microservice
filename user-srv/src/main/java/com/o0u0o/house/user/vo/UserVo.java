package com.o0u0o.house.user.vo;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

/**
 * @Author aiuiot
 * @Date 2020/1/7 10:27 上午
 * @Descripton: 用户vo
 **/
@Data
public class UserVo {

    private Long id; // 用户ID

    private String name; // 姓名

    private String email; // 邮箱

    private String phone; // 手机

    private String passwd; // 密码

    private String confirmPasswd; // 确认密码

    private Integer type; // 1-普通用户 2-经纪人

    private Date createTime; // 创建时间

    private Integer enable; // 是否激活

    private String avatar; // 头像 url地址

    private MultipartFile avatarFile; // 接收用户上传的文件(用户头像)

    private String newPassword; // 新密码 用于修改密码使用

    private String key; // 激活码

    private Long agencyId; // 经纪机构的ID

    private String aboutme; // 关于我

    private String agencyName; // 经纪人姓名
}

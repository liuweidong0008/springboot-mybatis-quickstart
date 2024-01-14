package com.itheima.pojo;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Administrator
 * @version 1.0
 * @description: 用户实体类
 * @date 2023/4/2 16:34
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    /**
     * 主键ID
     */
    private Integer id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private Short age;
    /**
     * 性别
     */
    private Short gender;
    /**
     * 手机号
     */
    private String phone;

}

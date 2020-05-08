package com.ljh.ems.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

@Data //添加get set 方法
@ToString //添加tostring方法
@AllArgsConstructor  //添加全参构造
@NoArgsConstructor //添加无参构造
@Accessors(chain = true) //不懂
public class User {
    private String id;
    private String username;
    private String realname;
    private String password;
    private String sex;
}

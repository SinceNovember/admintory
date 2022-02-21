package com.simple.system.model.enums;

import lombok.AllArgsConstructor;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * 授权类别
 */
@AllArgsConstructor
public enum PermissionType implements ValueEnum<Integer>{

    ROLE(1, "角色"),
    DEPT(2, "部门"),
    USER(3, "用户");

    private final Integer value;
    private final String msg;

    @Override
    public Integer getValue() {
        BufferedInputStream
        return value;
    }

    public String getMsg() {
        return msg;
    }
}

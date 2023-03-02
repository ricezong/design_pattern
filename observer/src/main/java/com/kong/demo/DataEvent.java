package com.kong.demo;

import lombok.Data;

/**
 * 定义抽象的事件接口 这个接口相当于群里面发布的通知
 *
 * @author: GZ
 * @date: 2022/11/7 15:49
 */
@Data
public abstract class DataEvent {
    private String msg;
}

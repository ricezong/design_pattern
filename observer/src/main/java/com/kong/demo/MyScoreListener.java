package com.kong.demo;

import org.springframework.stereotype.Component;

/**
 * MyListener的实现类，分数监听者
 *
 * @author: GZ
 * @date: 2022/11/7 15:56
 */
@Component
public class MyScoreListener implements MyListener {
    @Override
    public void onEvent(DataEvent dataEvent) {
        if (dataEvent instanceof ScoreDataEvent) {
            //...省略业务逻辑
            System.out.println("积分处理：" + dataEvent.getMsg());
        }
    }
}

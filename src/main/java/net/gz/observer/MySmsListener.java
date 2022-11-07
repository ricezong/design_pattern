package net.gz.observer;

import org.springframework.stereotype.Component;

/**
 * MyListener的实现类，短信监听者
 *
 * @author: GZ
 * @date: 2022/11/7 15:56
 */
@Component
public class MySmsListener implements MyListener {
    @Override
    public void onEvent(DataEvent dataEvent) {
        if (dataEvent instanceof SmsDataEvent) {
            //...省略短信处理逻辑
            System.out.println("短信处理");
        }
    }
}
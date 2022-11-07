package net.gz.observer;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * 循环调用方式的观察者（同步）
 *
 * @author: GZ
 * @date: 2022/11/7 15:52
 */
@Component
public class LoopObserverImpl implements ObserverInterface<MyListener> {
    //监听者的注册列表
    private List<MyListener> listenerList = new ArrayList<>();
    @Override
    public void registerListener(MyListener listener) {
        listenerList.add(listener);
    }

    @Override
    public void removeListener(MyListener listener) {
        listenerList.remove(listener);
    }

    @Override
    public void notifyListener(DataEvent event) {
        for (MyListener myListener : listenerList) {
            myListener.onEvent(event);
        }
    }
}

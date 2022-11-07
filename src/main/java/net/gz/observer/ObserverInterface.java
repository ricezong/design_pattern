package net.gz.observer;

/**
 * 观察者的顶层接口
 *
 * @author: GZ
 * @date: 2022/11/7 15:46
 */
public interface ObserverInterface<T> {
    //注册监听者
    void registerListener(T t);

    //移除监听者
    void removeListener(T t);

    //通知监听者
    void notifyListener(DataEvent t);
}

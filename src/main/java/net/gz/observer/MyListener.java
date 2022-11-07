package net.gz.observer;

/**
 * Listener的顶级接口，为了抽象Listener而存在
 *
 * @author: GZ
 * @date: 2022/11/7 15:48
 */
public interface MyListener {
    void onEvent(DataEvent event);
}

package com.kong.demo;

/**
 * 饿汉式单例模式
 * 天生线程安全
 *
 * @author: GZ
 * @date: 2023/3/2 14:26
 */
public class HungryManSingleton {

    //饿汉式单例类.在类初始化时，已经自行实例化
    //静态常量方式属于饿汉式，以静态变量的方式声明对象。这种单例模式在Spring中使用的比较多
    private static final HungryManSingleton INSTANCE = new HungryManSingleton();

    private HungryManSingleton() {
    }

    public static HungryManSingleton getInstance() {
        return INSTANCE;
    }

}

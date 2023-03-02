package com.kong.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: GZ
 * @date: 2022/11/7 15:57
 */
public class Operator {
    public static void main(String[] args) {
        //通过spring的AnnotationConfigApplicationContext将com.gz.demo路径下的所有加了spring注解的类都扫描放入spring容器
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.gz.demo");
        //从spring容器中获取对应bean的实例
        LoopObserverImpl loopObserver = context.getBean(LoopObserverImpl.class);
        MyScoreListener scoreL = context.getBean(MyScoreListener.class);
        MySmsListener smsL = context.getBean(MySmsListener.class);

        //向观察者中注册listener
        loopObserver.registerListener(scoreL);
        loopObserver.registerListener(smsL);
        ScoreDataEvent scoreData = new ScoreDataEvent();
        scoreData.setMsg("循环同步观察者");
        //发布积分事件，通知监听者
        loopObserver.notifyListener(scoreData);

        /*******************************************/
        //从spring容器获取QueueObserverImpl观察者

        QueueObserverImpl queueObserver = context.getBean(QueueObserverImpl.class);
        //向观察者中注册listener
        queueObserver.registerListener(scoreL);
        queueObserver.registerListener(smsL);
        ScoreDataEvent scoreData1 = new ScoreDataEvent();
        scoreData1.setMsg("队列异步观察者");
        //发布积分事件，通知监听者
        queueObserver.notifyListener(scoreData1);
    }
}

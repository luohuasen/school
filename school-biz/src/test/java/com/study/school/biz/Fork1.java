package com.study.school.biz;

import java.util.concurrent.RecursiveAction;

/**
 * @Auther: luohuasen
 * @Description:
 * @Date: Created in 2017/12/27 8:57
 */
public class Fork1 {
    public void invoke(){
        RecursiveAction action = new RecursiveAction() {
            @Override
            protected void compute() {
                int time = (int)(Math.random()*10000);
                System.out.println(Thread.currentThread().getName() + time + " : start");
                try {
                    Thread.sleep(time);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + time + " : end");
            }
        };
        action.fork();
        action.join();
    }
}

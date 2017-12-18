package com.study.school.biz.fork;

import java.util.concurrent.RecursiveTask;

/**
 * @Auther: luohuasen
 * @Description:
 * @Date: Created in 2017/12/18 15:15
 */
public class SumTask extends RecursiveTask<Long>{
    private int num;
    private String name;
    private String worlds;
    @Override
    protected Long compute() {
        long sum = 0;
        for (int i = 0; i < num; i++) {
            sum += i;
        }
        return sum;
    }

    public SumTask(int index){
        name = "task_" + index;
        this.num = (int)(Math.random()*10000000);
        worlds = name + "执行完成！  计算数量 ： " + num;
    }

    public int getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    public void end(){
        System.out.println(worlds);
    }
}

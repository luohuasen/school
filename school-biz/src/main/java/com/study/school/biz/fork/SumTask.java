package com.study.school.biz.fork;

import java.util.concurrent.RecursiveTask;

/**
 * @Auther: luohuasen
 * @Description:
 * @Date: Created in 2017/12/18 15:15
 */
public class SumTask extends RecursiveTask<Long>{
    private String threadName;
    private String taskName;
    private boolean deleted = false;
    @Override
    protected Long compute() {
        threadName = Thread.currentThread().getName() + ": ";
        System.out.println(threadName + taskName + " 开始执行");
        long sum = 0;
        for (int i = 0; i < 10000000; i++) {
            sum += i;
        }
        return sum;
    }

    public SumTask(int index){
        taskName = "task_" + index;
    }

    public String getThreadName() {
        return threadName;
    }

    public String getTaskName() {
        return taskName;
    }

    public void end(){
        System.out.println(threadName + taskName + " 结束执行");
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
}

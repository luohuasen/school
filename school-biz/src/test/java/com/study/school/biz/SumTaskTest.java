package com.study.school.biz;

import com.study.school.biz.fork.SumTask;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

/**
 * @Auther: luohuasen
 * @Description:
 * @Date: Created in 2017/12/18 15:19
 */
public class SumTaskTest  extends BizTestBase{
    ForkJoinPool pool = new ForkJoinPool();
    @Test
    public void test() throws InterruptedException {
        RecursiveAction action = new RecursiveAction() {
            @Override
            protected void compute() {
                dispatch1();
            }
        };


        pool.submit(action);
        action.join();
    }

    public void dispatch1(){
        System.out.println("Leavl  : ActiveThreadCount :  QueuedTaskCount : PoolSize");
        RecursiveAction action  = null;
        List<RecursiveAction> recursiveActionList  = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            action = new RecursiveAction() {
                @Override
                protected void compute() {
                     dispatch2();
                }
            };
            action.fork();
            recursiveActionList.add(action);
        }
        for (RecursiveAction action1 : recursiveActionList){
            action1.join();
        }
    }

    public void dispatch2(){
        SumTask task  = null;
        List<SumTask> recursiveTasks = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            task = new SumTask(i);
            recursiveTasks.add(task);
            task.fork();
        }

        Long sum = 0L;
        for (SumTask task1 : recursiveTasks){
            task1.join();
            task1.end();
        }
    }
}

package com.study.school.biz;

import com.study.school.biz.fork.SumTask;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

/**
 * @Auther: luohuasen
 * @Description:
 * @Date: Created in 2017/12/18 15:19
 */
public class SumTaskTest  extends BizTestBase{
    @Test
    public void test(){
        for (int i = 2; i < 100; i++) {
            testExample(i, 100);
        }
    }

    private void testExample(int poolSize, final int num){
        final ForkJoinPool forkJoinPool = new ForkJoinPool(poolSize);
        RecursiveAction action = new RecursiveAction() {
            @Override
            protected void compute() {
                List<SumTask> sumTaskList = new ArrayList<>();
                SumTask sumTask = null;
                for (int i = 0; i < num; i++) {
                    sumTask = new SumTask(i);
                    sumTask.fork();
                    sumTaskList.add(sumTask);
                }
                int size = sumTaskList.size();
                Set<String> nameSet = new HashSet<>();
                while(nameSet.size() < sumTaskList.size()){
                    for(SumTask task : sumTaskList){
                        if(!task.isDone()){
                            continue;
                        }
                        if(nameSet.contains(task.getName())){
                            continue;
                        }
                        nameSet.add(task.getName());
                    }
                }

            }
        };
        long start = System.currentTimeMillis();
        forkJoinPool.invoke(action);
        long end = System.currentTimeMillis();
        forkJoinPool.shutdown();
        System.out.println("线程池大小: "+ poolSize+"; 耗时： " + (end - start));
    }
}

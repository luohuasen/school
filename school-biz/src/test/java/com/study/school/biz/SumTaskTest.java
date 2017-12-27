package com.study.school.biz;

import org.junit.Test;

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
                Fork1 fork1 = null;
                for (int i = 0; i < 10; i++) {
                    fork1 = new Fork1();
                    fork1.invoke();
                }
            }
        };

        pool.submit(action);
        action.join();
    }
}

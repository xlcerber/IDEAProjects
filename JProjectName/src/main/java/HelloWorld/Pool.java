package HelloWorld;


import java.lang.*;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.InterruptedException;
import java.lang.Override;
import java.lang.Runnable;
import java.lang.Runtime;
import java.lang.String;
import java.lang.System;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import java.util.concurrent.BlockingQueue;


public class Pool {

    static class InterThread extends Thread {
        @Override
        public void run(){
            while (!Thread.currentThread().isInterrupted()) {
                try{
                    System.out.println("Thread::sleep");
                    TimeUnit.SECONDS.sleep(1);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    static class newThread implements Callable<Integer> {
        int num;

        newThread(int num) {
            this.num = num;
        }

        @Override
        public Integer call() throws Exception {
            int acc = 0;
            try {
                for (int i=1; i < num; i++){
                    TimeUnit.SECONDS.sleep(1);
                    acc += 1;
                }
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            return acc;
        }
    }


    public static void main(String[] args) throws Exception {
        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("Processor avaible: " + cores );

        final BlockingQueue<Runnable> queue = new ArrayBlockingQueue<>(100);
        ExecutorService service = new ThreadPoolExecutor(4, 4, 0L, TimeUnit.MILLISECONDS, queue);

        // ExecutorService service = Executors.newFixedThreadPool(4);

        List<Future> futures = new ArrayList<>();
        for (int i=1; i < 6; i++)  {

            try {
                Future future = service.submit(new newThread(i*2));
                futures.add(future);
            }
            catch (RejectedExecutionException e)
            {
                e.printStackTrace();
            }
            //TimeUnit.SECONDS.sleep(1);
        }

        System.out.println("/************/");

        InterThread tr = new InterThread();
        tr.start();
        TimeUnit.SECONDS.sleep(5);
        tr.interrupt();

        for (Future f : futures) {
            System.out.println("result:" + f.get());
        }

        System.out.println("Program has been finished.");
    }

}
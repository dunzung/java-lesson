package com.dunzung.lesson.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Wooola
 * @link zhijund@163.com
 * @since 2020/6/5
 */
public class ThreadTests {

    static final int THREADS = 5;

    static final int sleep = 15 * 1000;

    public static void main(String[] args) {
        new Thread(new PendMainThread()).start();
        new Thread(new ReadMainThread()).start();
    }

    public static class PendMainThread implements Runnable {
        ExecutorService pendExecutor = Executors.newFixedThreadPool(THREADS);

        public void run() {
            List<String> pendList = Collections.synchronizedList(new ArrayList<String>());
            System.out.println("待办所有线程开始");
            for (int i = 0; i < THREADS; i++) {
                pendExecutor.submit(new PendWorker(pendList));
            }
            pendExecutor.shutdown();
            while (true) {
                if (pendExecutor.isTerminated()) {
                    break;
                }
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("待办所有线程结束");
        }
    }

    public static class ReadMainThread implements Runnable {
        ExecutorService readExecutor = Executors.newFixedThreadPool(THREADS);

        public void run() {
            System.out.println("待阅所有线程开始");
            List<String> readList = Collections.synchronizedList(new ArrayList<String>());
            for (int i = 0; i < THREADS; i++) {
                readExecutor.submit(new ReadWorker(readList));
            }
            readExecutor.shutdown();
            while (true) {
                if (readExecutor.isTerminated()) {
                    break;
                }
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("待阅所有线程结束");
        }
    }

    public static class PendWorker implements Runnable {
        private List<String> pendList;

        public PendWorker(List<String> pendList) {
            this.pendList = pendList;
        }

        public void run() {
            System.out.println("PendWorker 待办执行::" + Thread.currentThread().getName() + "::开始");
            for (int i = 0; i < 10000; i++) {
                String str = "PendWorker 待办执行第::" + Thread.currentThread().getName() + "::" + (i + 1) + "::条";
                System.out.println(str);
                pendList.add(str);
            }
            System.out.println("PendWorker 待办执行::" + Thread.currentThread().getName() + "::结束");
        }
    }

    public static class ReadWorker implements Runnable {
        private List<String> readList;

        public ReadWorker(List<String> readList) {
            this.readList = readList;
        }

        public void run() {
            System.out.println("ReadWorker 待阅执行::" + Thread.currentThread().getName() + "::开始");
            for (int i = 0; i < 10000; i++) {
                String str = "ReadWorker 待办执行第::" + Thread.currentThread().getName() + "::" + (i + 1) + "::条";
                System.out.println(str);
                readList.add(str);
            }
            System.out.println("ReadWorker 待阅执行::" + Thread.currentThread().getName() + "::结束");
        }
    }
}

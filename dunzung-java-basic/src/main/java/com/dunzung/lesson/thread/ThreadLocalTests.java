package com.dunzung.lesson.thread;

public class ThreadLocalTests {

//    static ThreadLocal<String> threadLocal = new ThreadLocal<>();

    public static void main(String[] args) {
        final ThreadLocal<String> threadLocal = new ThreadLocal<>();
        new Thread(new Runnable() {
            @Override
            public void run() {
                threadLocal.set("abc");
                threadLocal.set("abc1");
                threadLocal.set("abc2");
                threadLocal.set("abc3");
                threadLocal.set("abc4");
            }
        }).start();

    }
}

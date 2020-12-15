package com.dunzung.lesson.clazz;

import java.util.concurrent.atomic.AtomicInteger;

public class Static01 {

    private final int threadLocalHashCode = nextHashCode();
    private static AtomicInteger nextHashCode = new AtomicInteger();

    static{
        System.out.println("静态块1");
    }

    private static final int HASH_INCREMENT = getIncr();

    static{
        System.out.println("静态块2");
    }

    public Static01() {
    }

    private static int getIncr() {
        return 0x61c88647;
    }

    private static int nextHashCode() {
        return nextHashCode.getAndAdd(HASH_INCREMENT);
    }

    private static int nextHashCode1() {
        return nextHashCode.getAndAdd(HASH_INCREMENT);
    }

    public static void main(String[] args) {
        Static01 s= new Static01();
    }


}

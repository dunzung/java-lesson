package com.dunzung.lesson.map;

public class Hash {

    public static void main(String[] args) {
        long l1 = (long) ((1L << 32) * (Math.sqrt(5) - 1)/2);
        System.out.println(l1);
        int i = (int) l1;
        System.out.println(i);
    }

}

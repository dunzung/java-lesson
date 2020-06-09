package com.dunzung.lesson.thread;

/**
 * @author Wooola
 * @link zhijund@163.com
 * @since 2020/6/5
 */
public class Test1 {

    private static final int COUNT_BITS = Integer.SIZE - 3;
   // private static final int CAPACITY   = (1 << COUNT_BITS) - 1;

    public static void main(String[] args) {
        System.out.println(COUNT_BITS);

        int CAPACITY   = (3 << COUNT_BITS) - 1;
        System.out.println(CAPACITY);
        add();
    }

    public static void add(){
        int t = 3;
        for(int i =0;i<29;i++){
            t= t*2;
        }
        System.out.println(t -1);
    }

}

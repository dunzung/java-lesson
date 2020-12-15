package com.dunzung.lesson.bit;

public class Bitcal {

    private String a;

    public static void main(String[] args) {

        Integer i = 4;
        // 0000 0000 0000 0000 0000 0000 0000 0010
        String is = Integer.toBinaryString(i);
        System.out.println(is);
//        二进制：Integer.valueOf("0101",2).toString;
        System.out.println(Integer.valueOf("100",2));
//        八进制：Integer.valueOf("376",8).toString;
//        十六进制：Integer.valueOf("FFFF",16).toString;



    }

}

package com.dunzung.lesson.stream;


import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

/**
 * @author Wooola
 * @link zhijund@163.com
 * @since 2020/5/8
 */
public class StreamHashMap {

    public static void main(String[] args) {
        Map<String, Integer> m = new HashMap<>();
        m.put("a", 1);
        m.put("b", 11);
        m.put("c", 12);
        m.put("d", 13);
        m.put("e", 41);
        m.put("f", 15);

        long s = System.currentTimeMillis();
        m.forEach((k, v) -> {
            System.out.println(k + v);
        });
        long e = System.currentTimeMillis();
        System.out.println(e - s);

        s = System.currentTimeMillis();
        for (Map.Entry<String,Integer> entry:m.entrySet()){
            System.out.println(entry.getKey() + entry.getValue());
        }
        e = System.currentTimeMillis();
        System.out.println(e - s);
    }

}

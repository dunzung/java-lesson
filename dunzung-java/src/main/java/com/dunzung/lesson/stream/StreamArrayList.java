package com.dunzung.lesson.stream;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Wooola
 * @link zhijund@163.com
 * @since 2020/5/8
 */
public class StreamArrayList {

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        list1.add("d");
        list1.add("d");
        list1.add("f");
        list1.parallelStream().distinct().forEach(System.out::println);
    }

}

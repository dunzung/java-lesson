package com.dunzung.lesson.stream;

import java.util.stream.Stream;

/**
 * @author Wooola
 * @link zhijund@163.com
 * @since 2020/5/8
 */
public class StreamDemo {

    public static void main(String[] args) {
//        Stream<String> s = Stream.of("test", "t1", "t2", "teeeee", "aaaa");
//        s.flatMap(n -> Stream.of(n.split(""))).forEach(System.out::println);

        Stream<String> s = Stream.of("test", "t1", "t2", "teeeee", "aaaa");
        s.map(n -> n.concat(".txt")).forEach(System.out::println);
    }

}

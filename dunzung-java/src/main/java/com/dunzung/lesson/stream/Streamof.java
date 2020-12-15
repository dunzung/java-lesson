package com.dunzung.lesson.stream;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Wooola
 * @link zhijund@163.com
 * @since 2020/5/8
 */
public class Streamof {

    public static void main(String[] args) {
//        Stream<String> s = Stream.of("file", "t1", "t2", "teeeee", "aaaa");
//        s.flatMap(n -> Stream.of(n.split(""))).forEach(System.out::println);

        Stream<String> s = Stream.of("file", "t1", "t2", "teeeee", "aaaa");
        s.map(n -> n.concat(".txt")).forEach(System.out::println);
        Stream<Integer> ss = Stream.of(1,3,4,5,6);
        List<Integer> list = ss.filter(i->i>4).collect(Collectors.toList());
        list.forEach(System.out::println);

    }

}

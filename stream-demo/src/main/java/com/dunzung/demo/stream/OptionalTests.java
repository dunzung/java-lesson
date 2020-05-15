package com.dunzung.demo.stream;

import java.util.Optional;

/**
 * @author Wooola
 * @link zhijund@163.com
 * @since 2020/5/8
 */
public class OptionalTests {

    public static void main(String[] args) {
        Optional<String> s = Optional.ofNullable(test());

        s.ifPresent(System.out::println);
        System.out.println(s.isPresent());
    }

    public static String test(){
        return "sss";
    }

}

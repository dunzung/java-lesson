package com.dunzung.lesson.lambda;

import java.util.function.Supplier;

public class SupplierTests {

    public static void main(String[] args) {
        Supplier<String> s = ()-> "abc";
        System.out.println(s.get());
    }

}

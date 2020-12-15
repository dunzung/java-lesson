package com.dunzung.lesson.lambda;

public class FunctionalTests {

    public static void main(String[] args) {
        HelloFunctionalInterface i = ()->{
            System.out.println("dfsdfdsf");
        };
        i.hello();
        Price p = ()->5.6;
        print(p);
    }

    interface Price{
        double getPrice();
    }

    public static void print(Price p){
        System.out.println(p.getPrice());
    }
}

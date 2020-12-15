package com.dunzung.lesson.designpattern;

/**
 * @author Wooola
 * @link zhijund@163.com
 * @since 2020/6/9
 */
public class SingletonDemo {

    enum Singleton{
        instance;
        public void otherMethods(){
            System.out.println("Something");
        }
    }

    public static void main(String[] args) {
        Singleton.instance.otherMethods();
    }
}

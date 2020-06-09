package com.dunzung.lesson.algorithm;

/**
 * @author Wooola
 * @link zhijund@163.com
 * @since 2020/5/15
 */
public class Bubblesort {

    public static void main(String[] args) {
        //t1();
        t2();
    }

    static void t2() {
        int[] ages = new int[]{23, 45, 5232, 2, 43, 567, 56543, 1221, 32};
        for (int i = ages.length - 1; i >= 0; i--) {
            int tmp = 0;
            System.out.println("第" + i + "次>>>>>>>>>>>>>>>");
            for (int j = 0; j < i; j++) {

                if (ages[i] < ages[j]) {
                    System.out.println(ages[i] + "::" + ages[j]);
                    tmp = ages[j];
                    ages[j] = ages[i];
                    ages[i] = tmp;
                }
            }

            for (int a = 0; a < ages.length; a++) {
                System.out.println(ages[a]);
            }
        }
//        for (int i = 0; i < ages.length; i++) {
//            System.out.println(ages[i]);
//        }
    }

    static void t1() {
        int[] ages = new int[]{23, 45, 5232, 2, 43, 567};
        for (int i = 0; i < ages.length; i++) {
            int tmp = 0;
            for (int j = 0; j < ages.length; j++) {
                if (ages[i] < ages[j]) {
                    tmp = ages[j];
                    ages[j] = ages[i];
                    ages[i] = tmp;
                }
            }
        }
        for (int i = 0; i < ages.length; i++) {
            System.out.println(ages[i]);
        }
    }

}

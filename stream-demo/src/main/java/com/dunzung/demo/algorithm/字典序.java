package com.dunzung.demo.algorithm;

/**
 * @author Wooola
 * @link zhijund@163.com
 * @since 2020/5/15
 */
public class 字典序 {

    public static void main(String[] args) {
        String numStr = "358764";
        char[] chs = numStr.toCharArray();
        // 从右至左找到第一个左边小于右边的索引位置
        int leftInd = findLeftNumIndex(chs);
        int leftNum = chs[leftInd];

        // 从右至左找到第一个右边数大于 leftNum 的索引位置
        int rightInd = findRightNumInd(leftNum, chs);
        int rightNum = chs[rightInd];

        // 互换
        char tmp = chs[leftInd];
        chs[leftInd] = chs[rightInd];
        chs[rightInd] = tmp;

        rightSort(leftInd,chs);
        System.out.println(new String(chs));

    }

    public static void rightSort(int leftInd, char[] chs) {
        int start = leftInd + 1;
        for (int i = start; i < chs.length; i++) {
            for (int j = i; j < chs.length; j++) {
                char tmp = 0;
                if (chs[i] > chs[j]) {
                    tmp = chs[i];
                    chs[i] = chs[j];
                    chs[j] = tmp;
                }
            }
        }
    }

    // 从右至左找到第一个右边数大于 leftNum 的索引位置
    public static int findRightNumInd(int leftNum, char[] chs) {
        for (int i = chs.length - 1; i >= 0; i--) {
            if (chs[i] > leftNum) {
                return i;
            }
        }
        return 0;
    }

    /**
     * 从右至左找到第一个左边小于右边的索引位置
     *
     * @return
     */
    public static int findLeftNumIndex(char[] chs) {
        int ind = 0;
        for (int i = chs.length - 1; i >= 0; i--) {
            if (chs[i - 1] < chs[i]) {
                return i - 1;
            }
        }
        return ind;
    }

}

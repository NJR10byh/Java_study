package day10.demo5;

import java.util.Arrays;

/**
 * @author NJR10byh
 * @date 2022/7/27 15:54:43
 * @description Arrays
 */

public class task5 {
    public static void main(String[] args) {
        int[] arr = {23, 4, 54, 43, 8, 10, 1};

        System.out.println(Arrays.toString(arr));

        // 排序
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        // 二分搜索技术（前提是数组必须排好序，否则报错）
        int index = Arrays.binarySearch(arr, 43);
        System.out.println(index);

        // 返回不存在元素的规律：-（应该插入位置的下标 + 1）
        int index2 = Arrays.binarySearch(arr, 45); // -（6 + 1）= -7
        int index3 = Arrays.binarySearch(arr, 5); // -（2 + 1）= -3
        System.out.println(index2);
        System.out.println(index3);
    }
}

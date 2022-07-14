package day2;

/**
 * @author NJR10byh
 * @date 2022/7/13 15:18:09
 * @description 两种方法初始化数组
 */

public class task5 {
    public static void main(String[] args) {
        // 动态初始化数组
        int[] arr1 = new int[3];
        System.out.println(arr1);

        // 静态初始化数组
        int[] arr2 = {1, 2, 3};
        System.out.println(arr2);
    }
}

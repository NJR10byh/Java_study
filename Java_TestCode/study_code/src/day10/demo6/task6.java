package day10.demo6;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author NJR10byh
 * @date 2022/7/27 16:40:50
 * @description 降序排列（自定义比较器）
 */

public class task6 {
    public static void main(String[] args) {
        int[] arr1 = {23, 4, 54, 43, 8, 10, 1};

        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        Integer[] arr2 = {23, 4, 54, 43, 8, 10, 1};
        Arrays.sort(arr2, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                /**
                 * 比较规则：
                 * o1 - o2 > 0：升序
                 * o2 - o1 > 0：降序
                 */
                return o2 - o1;
            }
        });
        System.out.println(Arrays.toString(arr2));
    }
}

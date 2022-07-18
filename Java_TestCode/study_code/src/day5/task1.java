package day5;

/**
 * @author NJR10byh
 * @date 2022/7/18 9:27:00
 * @description 使用 StringBuilder 来拼接字符串
 */
public class task1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        StringBuilder stringBuilder = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                stringBuilder.append(arr[i] + ",");
            } else {
                stringBuilder.append(arr[i] + "]");
            }
        }
        System.out.println(stringBuilder);
    }
}

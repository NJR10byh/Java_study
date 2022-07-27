package day10.demo1;

/**
 * @author NJR10byh
 * @date 2022/7/27 10:24:24
 * @description 包装类（8种基本数据类型）
 */

public class task1 {
    public static void main(String[] args) {
        Integer age = 199;
        String s = age.toString();
        System.out.println(s);

        String num1 = "23";
        String num2 = "23.7";
        System.out.println(num1 + 1); // 231

        // int acount = Integer.parseInt(num);
        // 记 valueOf 即可
        int acount1 = Integer.valueOf(num1);
        double acount2 = Double.valueOf(num2);
        System.out.println(acount1 + 1); // 24
        System.out.println(acount2 + 0.1); // 23.8
    }
}

package day2;

/**
 * @author NJR10byh
 * @date 2022/7/13 14:32:22
 * @description 关系运算符、短路运算符
 */

public class task1 {
    public static void main(String[] args) {
        int i = 10, j = 20;
//        System.out.println(i = j); // 20（= 相当于赋值操作，j的值赋给i，然后输出i）

//        &：无论右边真假，都要执行，&&：左边为假，右边不执行
//        System.out.println((i++ > 100) & (j++ > 100));
        System.out.println((i++ > 100) && (j++ > 100));

        System.out.println("i = " + i);
        System.out.println("j = " + j);
    }
}

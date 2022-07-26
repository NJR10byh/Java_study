package day9.demo3;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author NJR10byh
 * @date 2022/7/26 15:57:53
 * @description BigDecimal
 */

public class task3 {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal(0.1);
        System.out.println(a);
        /** 不建议使用 new BigDecimal(0.1)，因为结果为 0.1000000000000000055511151231257827021181583404541015625
         * 会导致失真
         * 推荐使用BigDecimal.valueOf(0.1)
         */

        BigDecimal a1 = BigDecimal.valueOf(0.1);
        BigDecimal a2 = BigDecimal.valueOf(0.2);

        System.out.println(0.1 + 0.2); // 0.30000000000000004
        System.out.println(a1.add(a2)); // 加 add
        System.out.println(a1.subtract(a2)); // 减 subtract
        System.out.println(a1.multiply(a2)); // 乘 multiply
        System.out.println(a1.divide(a2)); // 除 divide

        BigDecimal b1 = BigDecimal.valueOf(10.0);
        BigDecimal b2 = BigDecimal.valueOf(3.0);
        // 参数一：除数，参数二：保留的小数位数，参数三：舍入模式
        BigDecimal b3 = b1.divide(b2, 2, RoundingMode.HALF_UP);
        System.out.println(b3);

        double res = b3.doubleValue(); // 将结果转为double类型，方便传值
        System.out.println(res);

    }
}

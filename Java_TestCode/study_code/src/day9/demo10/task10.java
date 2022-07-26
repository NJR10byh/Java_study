package day9.demo10;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author NJR10byh
 * @date 2022/7/26 19:09:56
 * @description DateTimeFormatter 格式化时间
 */

public class task10 {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // 正反都能调
        System.out.println(dtf.format(ldt));
        System.out.println(ldt.format(dtf));

        // 解析字符串时间
        LocalDateTime ldt1 = LocalDateTime.parse("2022-11-11 11:11:11", dtf);
        System.out.println(ldt1);

        // 只有转换为 LocalDateTime 类才能调 getDayOfYear 等方法
        System.out.println(ldt1.getDayOfYear());

    }
}

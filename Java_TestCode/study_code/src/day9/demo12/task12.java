package day9.demo12;

import java.time.Duration;
import java.time.LocalDateTime;

/**
 * @author NJR10byh
 * @date 2022/7/26 19:26:02
 * @description Duration（时间间隔）
 */

public class task12 {
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();
        System.out.println(today);

        LocalDateTime birthDate = LocalDateTime.of(2000, 10, 7, 10, 40, 00);
        System.out.println(birthDate);

        Duration duration = Duration.between(birthDate, today); // 第二个参数 - 第一个参数
        System.out.println(duration.toDays()); // 相差 天
        System.out.println(duration.toHours()); // 相差 小时（相较于 birthDate）
        System.out.println(duration.toHoursPart()); // 相差 小时（相较于 birthDate 中的小时）
        System.out.println(duration.toMinutes()); // 相差 分钟（相较于 birthDate）
        System.out.println(duration.toMinutesPart()); // 相差 小时（相较于 birthDate 中的分钟）
        System.out.println(duration.toSeconds()); // 相差 秒
        System.out.println(duration.toMillis()); // 相差 毫秒
        System.out.println(duration.toNanos()); // 相差 纳秒
    }
}

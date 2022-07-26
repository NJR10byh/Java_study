package day9.demo9;

import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

/**
 * @author NJR10byh
 * @date 2022/7/26 18:58:56
 * @description Instant 时间戳
 */

public class task9 {
    public static void main(String[] args) {
        Instant ins = Instant.now();
        System.out.println(ins); // 取得的是世界标准时间（错8小时）
        System.out.println(ins.atZone(ZoneId.systemDefault()));// 取得的是系统默认时区

        // instant 转 日期对象
        Date d = Date.from(ins);
        System.out.println(d);

        // 日期对象 转 instant
        System.out.println(d.toInstant());
    }
}

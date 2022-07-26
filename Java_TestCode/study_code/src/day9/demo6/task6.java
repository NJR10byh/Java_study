package day9.demo6;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author NJR10byh
 * @date 2022/7/26 17:04:23
 * @description SimpleDateFormat 格式化日期为熟悉格式
 */

public class task6 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // 1、接受毫秒值
        // 格式化当前时间 + 1000秒
        long currTime_ms = System.currentTimeMillis();
        String currformatTime_ms = sdf.format(currTime_ms);
        System.out.println(currformatTime_ms);
        String formatTime_ms = sdf.format(currTime_ms + 1000 * 1000);
        System.out.println(formatTime_ms);

        System.out.println("-------------------");

        // 2、接受时间对象
        Date currTime_date = new Date();
        String currformatTime_date = sdf.format(currTime_date);
        System.out.println(currformatTime_date);
    }
}

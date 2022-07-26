package day9.demo7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author NJR10byh
 * @date 2022/7/26 17:32:18
 * @description SimpleDateFormat 熟悉的格式转换为日期对象
 */

public class task7 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String dateStr = "2022-07-26 17:32:18";
        Date d = sdf.parse(dateStr);
        System.out.println(d); // Tue Jul 26 17:32:18 CST 2022

        // 当前时间往后走 12天5小时26分15秒
        Date currTime_date = new Date();
        String currTime_format = sdf.format(currTime_date);
        System.out.println(currTime_format);
        /**
         * long resTime_ms = d.getTime() + (12 * 24 * 60 * 60 + 5 * 60 * 60 + 26 * 60 + 15) * 1000;
         * (12 * 24 * 60 * 60 + 5 * 60 * 60 + 26 * 60 + 15) * 1000
         * 这种方式的结果默认采用 int 保存，但是结果可能会超出 int 的范围
         * 采用 long 保存更保险
         * 在第一个数字后加"L"，使结果采用 long 保存
         */
        long resTime_ms = currTime_date.getTime() + (12L * 24 * 60 * 60 + 5 * 60 * 60 + 26 * 60 + 15) * 1000;
        String resTime_format = sdf.format(resTime_ms);
        System.out.println(resTime_format);
    }
}

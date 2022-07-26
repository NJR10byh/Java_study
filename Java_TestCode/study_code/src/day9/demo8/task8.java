package day9.demo8;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author NJR10byh
 * @date 2022/7/26 17:49:42
 * @description Calendar
 * 重写当前时间往后走 12天5小时26分15秒
 */

public class task8 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);
        System.out.println(System.currentTimeMillis());

        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        int days = cal.get(Calendar.DAY_OF_YEAR);
        System.out.println(year);
        System.out.println(month);
        System.out.println(days);
        System.out.println(cal.get(Calendar.SECOND));


        // 当前时间往后走 12天5小时26分15秒
        cal.add(Calendar.DAY_OF_YEAR, 12);
        cal.add(Calendar.HOUR, 5);
        cal.add(Calendar.MINUTE, 26);
        cal.add(Calendar.SECOND, 15);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date resTime_date = cal.getTime();
        String resTime = sdf.format(resTime_date);
        System.out.println(resTime);

        // set会影响 Calendar.getInstance()
        // add不会影响 Calendar.getInstance()
        System.out.println(Calendar.getInstance());
        System.out.println(Calendar.getInstance().get(Calendar.SECOND));
    }
}

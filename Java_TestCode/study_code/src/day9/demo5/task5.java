package day9.demo5;

import java.util.Date;

/**
 * @author NJR10byh
 * @date 2022/7/26 16:53:58
 * @description 时间毫秒值 转 日期对象
 */

public class task5 {
    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println(d1);

        long addtime = System.currentTimeMillis();
        addtime += (2 * 60 * 60 + 324) * 1000; // 当前时间往后2小时324秒

        /**
         * 时间毫秒值 转 日期对象
         * Date d = new Date(time); // time为时间毫秒值
         */
        Date d2 = new Date(addtime);
        System.out.println(d2);

        // 也可以使用 setTime 方法
        Date d3 = new Date();
        d3.setTime(addtime);
        System.out.println(d3);
    }
}

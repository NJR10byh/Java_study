package day10.demo4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author NJR10byh
 * @date 2022/7/27 15:21:41
 * @description 正则表达式爬取数据
 */

public class task4 {
    public static void main(String[] args) {
        String str = "来黑马程序学习Java，电话020-43422424，或者联系邮箱" +
                "itcast@itcast.cn, 电话18762832633， 0203232323" +
                "邮箱bozai@itcast.cn， 400-100-3233，4001003232";

        String regex = "(((13[0-9])|(14[5-9])|(15[0-3[5-9]])|(16[6-7])|(17[1-8])|(18[0-9])|(19[1|3|5|6|8|9]))\\d{8})|"
                + "(([a-zA-Z0-9]{1,30})@([a-zA-Z0-9]{2,20})(\\.[a-zA-Z0-9]{2,20}){1,2})|"
                + "(0\\d{2,3}-?\\d{5,20})|"
                + "(400-?\\d{3,8}-?\\d{3,8})";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        /*
         * 020-43422424
         * itcast@itcast.cn
         * 18762832633
         * 0203232323
         * bozai@itcast.cn
         * 400-100-3233
         * 4001003232
         * */
    }
}

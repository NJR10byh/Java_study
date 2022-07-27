package day10.demo2;

/**
 * @author NJR10byh
 * @date 2022/7/27 14:13:28
 * @description 工具类（校验常见的信息）
 */

public class validate {

    private validate() {
    }

    // 检查手机号格式
    public static boolean validatePhone(String str) {
        if (str.matches("^((13[0-9])|(14[5-9])|(15[0-3[5-9]])|(16[6-7])|(17[1-8])|(18[0-9])|(19[1|3|5|6|8|9]))\\d{8}$"))
            return true;
        else return false;
    }

    // 检验邮箱格式
    public static boolean validateEmail(String str) {
        if (str.matches("^([a-zA-Z0-9]{1,30})@([a-zA-Z0-9]{2,20})(\\.[a-zA-Z0-9]{2,20}){1,2}$")) return true;
        else return false;
    }

    // 校验电话格式
    public static boolean validateTelePhone(String str) {
        if (str.matches("^0\\d{2,3}-?\\d{7}$")) return true;
        else return false;
    }
}

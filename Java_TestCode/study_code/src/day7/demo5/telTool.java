package day7.demo5;

/**
 * @author NJR10byh
 * @date 2022/7/20 16:26:23
 * @description 构造方法私有化
 */

public class telTool {

    // 构造方法私有化（工具类无需创造对象，外界也无法产生工具类对象）
    private telTool() {
    }

    public static String telHide(String tel) {
        String tel_hided = tel.substring(0, 3) + "****" + tel.substring(7, 11);
        return tel_hided;
    }
}

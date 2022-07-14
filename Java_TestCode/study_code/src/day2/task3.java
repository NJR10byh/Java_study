package day2;

/**
 * @author NJR10byh
 * @date 2022/7/13 14:35:04
 * @description 珠穆朗玛峰 8844430毫米，纸张0.1毫米，折叠count次能达到珠峰高度
 */

public class task3 {
    public static void main(String[] args) {
        double i = 0.1;
        int count = 0, height = 8844430;
        while (i < height) {
            i *= 2;
            count++;
        }
        System.out.println("需要折叠 " + count + " 次");
    }
}

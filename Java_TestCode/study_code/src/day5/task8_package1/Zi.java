package day5.task8_package1;

/**
 * @author NJR10byh
 * @date 2022/7/18 23:22:17
 * @description 同一包的子类，能访问 默认、protected、public
 */

public class Zi extends Fu {
    public static void main(String[] args) {
        Fu f = new Fu();

        // f.show1();
        // 报错：show1是private权限，只能在本类中访问
        f.show2();
        f.show3();
        f.show4();
    }
}

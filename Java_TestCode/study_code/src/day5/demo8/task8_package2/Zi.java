package day5.demo8.task8_package2;

import day5.demo8.task8_package1.Fu;

/**
 * @author NJR10byh
 * @date 2022/7/18 23:08:51
 * @description 不同包的子类，只能访问 protected、public
 */

public class Zi extends Fu {
    public static void main(String[] args) {
        Zi z = new Zi();

        // z.show1();
        // z.show2();
        z.show3();
        z.show4();
    }
}

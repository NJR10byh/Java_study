package day5.demo8.task8_package2;

import day5.demo8.task8_package1.Fu;

/**
 * @author NJR10byh
 * @date 2022/7/18 23:08:47
 * @description 不同包的无关类，只能访问 public
 */

public class test {
    public static void main(String[] args) {
        Fu f = new Fu();

        f.show4();
    }
}

package day5.demo8.task8_package1;

/**
 * @author NJR10byh
 * @date 2022/7/18 23:08:36
 * @description private、默认、protected、public
 */

public class Fu {
    private void show1() {
        System.out.println("我是private");
    }

    void show2() {
        System.out.println("我是默认");
    }

    protected void show3() {
        System.out.println("我是protected");
    }

    public void show4() {
        System.out.println("我是public");
    }

    public static void main(String[] args) {
        // 同一个类中，private、默认、protected、public均可调用
        Fu f = new Fu();
        f.show1();
        f.show2();
        f.show3();
        f.show4();
    }
}

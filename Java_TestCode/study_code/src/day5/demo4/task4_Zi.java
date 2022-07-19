package day5.demo4;

/**
 * @author NJR10byh
 * @date 2022/7/18 15:33:40
 * @description 继承 -- 子类
 */

public class task4_Zi extends task4_Fu {

    public int age = 40;

    public void task4_Zi() {
        int age = 30;
        System.out.println(age); // 访问局部变量
        System.out.println(this.age); // 访问本类
        System.out.println(super.age); // 访问父类
    }
}

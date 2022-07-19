package day5.demo5;

/**
 * @author NJR10byh
 * @date 2022/7/18 16:47:01
 * @description 继承中构造方法的访问特点
 */

public class task5_Zi extends task5_Fu {
    public task5_Zi() {
        System.out.println("调用了task5_Zi无参构造方法");
    }

    public task5_Zi(int age) {
        System.out.println("调用了task5_Zi带参构造方法");
    }
}

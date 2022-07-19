package day6.demo1;

/**
 * @author NJR10byh
 * @date 2022/7/19 14:17:35
 * @description 多态
 * 1、有继承/实现关系
 * 2、有方法重写
 * 3、有父类引用指向子类对象
 */

public class task1 {
    public static void main(String[] args) {
        Animal a = new dog(); // 3、有父类引用指向子类对象
        a.eat();
    }
}

package day3;

/**
 * @author NJR10byh
 * @date 2022/7/15 13:11:28
 * @description 构造方法、重载
 */
public class task5_1 {
    private String name;
    private int age;

    // 构造方法
    public task5_1() {
        System.out.println("无参构造方法");
    }

    // 重载构造方法
    public task5_1(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("变量初始化成功！");
    }

    public void getInfo() {
        System.out.println("姓名：" + name);
        System.out.println("年龄：" + age);
    }
}

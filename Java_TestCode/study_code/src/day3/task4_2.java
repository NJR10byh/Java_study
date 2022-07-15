package day3;

/**
 * @author NJR10byh
 * @date 2022/7/15 10:23:38
 * @description private保护成员变量（调用）
 */
public class task4_2 {
    public static void main(String[] args) {
        task4_1 t = new task4_1();
        t.name = "Neymar JR";
//        t.age = 18; // 报错，private修饰，不能在别的类中被访问
        t.setAge(16);
        t.setAge(20);
        t.getInfo();
    }
}

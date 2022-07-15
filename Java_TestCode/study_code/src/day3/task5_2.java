package day3;

/**
 * @author NJR10byh
 * @date 2022/7/15 13:13:18
 * @description 构造方法（调用）
 */
public class task5_2 {
    public static void main(String[] args) {
        task5_1 t = new task5_1("Neymar JR", 28);// 创建对象实际上就是调用了构造方法
        t.getInfo();
    }
}

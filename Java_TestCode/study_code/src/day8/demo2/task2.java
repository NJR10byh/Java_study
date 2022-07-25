package day8.demo2;

/**
 * @author NJR10byh
 * @date 2022/7/25 23:02:02
 * @description 匿名内部类
 */
public class task2 {
    public static void main(String[] args) {
        Animal a = new Animal() {
            @Override
            public void run() {
                System.out.println("匿名内部类方法重写");
            }
        };
        a.run();
    }
}

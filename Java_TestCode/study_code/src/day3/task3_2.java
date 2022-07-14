package day3;

/**
 * @author NJR10byh
 * @date 2022/7/14 17:19:23
 * @description 类和对象 （调用）
 */
public class task3_2 {
    public static void main(String[] args) {
        task3_1 p1 = new task3_1();
        p1.brand = "Microsoft";
        p1.model = "SurfaceBook Pro";
        p1.inch = "14\"";
        System.out.println(p1.brand);
        p1.GetInfo();

        task3_1 p2 = new task3_1();
        p2.brand = "Apple";
        p2.model = "MacBook Pro";
        p2.inch = "16\"";
        System.out.println(p2.brand);
        p2.GetInfo();
    }
}

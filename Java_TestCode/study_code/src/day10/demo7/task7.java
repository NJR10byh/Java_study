package day10.demo7;

/**
 * @author NJR10byh
 * @date 2022/7/27 17:00:28
 * @description Lambda表达式
 */

public class task7 {
    public static void main(String[] args) {
        Swimming s1 = new Swimming() {
            @Override
            public void swim() {
                System.out.println("老师在游泳！");
            }
        };
        go(s1);

        System.out.println("-----------------");

        // Lambda表达式
        Swimming s2 = () -> System.out.println("学生在游泳！");
        go(s2);
    }

    public static void go(Swimming s) {
        System.out.println("开始");
        s.swim();
        System.out.println("结束");
    }
}

@FunctionalInterface
interface Swimming {
    void swim();
}
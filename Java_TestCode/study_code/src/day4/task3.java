package day4;

/**
 * @author NJR10byh
 * @date 2022/7/17 17:38:13
 * @description StringBuilder、append()、StringBuilder 与 String 相互转换
 */
public class task3 {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("hello");
        s1.append(" world"); // hello world
        System.out.println(s1);

        StringBuilder s2 = s1.append("!");
        System.out.println(s2); // hello world!（说明 s2与 s1 指向的 StringBuilder 相同）
        System.out.println(s2 == s1);// true （说明 StringBuilder 可变）

        // append链式编程
        StringBuilder s3 = new StringBuilder();
        s3.append("Neymar").append("JR").append(" 10");
        System.out.println(s3); // NeymarJR 10 （append返回的是方法，所以 append()方法支持链式编程）

        // StringBuilder -- String
        StringBuilder s4 = new StringBuilder();
        s4.append("hola");
//        String s5=s4; // 会报错，因为 s5（String）与 s4（StringBuilder）类型不一样
        String s6 = s4.toString(); // toString(): StringBuilder -- String
        System.out.println(s6);

        // String -- StringBuilder
        String s7 = "Tutu";
//        StringBuilder s8=s7; // 会报错，因为 s7（String）与 s8（StringBuilder）类型不一样
        StringBuilder s9 = new StringBuilder(s7); // 构造方法 StringBuilder(String s): String -- StringBuilder
        System.out.println(s9);
    }
}

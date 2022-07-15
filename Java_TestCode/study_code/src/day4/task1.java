package day4;

/**
 * @author NJR10byh
 * @date 2022/7/15 14:00:04
 * @description 字符串比较 equals()
 */
public class task1 {
    public static void main(String[] args) {
        char[] crr1 = {'n', 'j', 'r'};
        char[] crr2 = {'n', 'j', 'r'};
        String s1 = new String(crr1);
        String s2 = new String(crr2);

        System.out.println(s1);
        System.out.println(s2);

        String s3 = "njr";
        String s4 = "njr";

        System.out.println(s1 == s2);// false 两个都是new的，地址值肯定不一样
        System.out.println(s1 == s3);// false 赋值方式不一样，地址值肯定不一样
        System.out.println(s3 == s4);// true 字符串内容相同，两个对象就指向相同的地址

        // true
        // equals()只比较值，大家都是"njr"，所以都相同
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s4));
    }

}

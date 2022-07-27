package day10.demo3;

/**
 * @author NJR10byh
 * @date 2022/7/27 15:01:20
 * @description 使用正则表达式分割数据
 */

public class task3 {
    public static void main(String[] args) {
        String names = "石磊saddsasaddle2312田爱玲sda21dads马文浩";
        String[] arrs = names.split("\\w+");
        for (int i = 0; i < arrs.length; i++) {
            System.out.println(arrs[i]);
        }

        String str = names.replaceAll("\\w+", " ");
        System.out.println(str);
    }
}

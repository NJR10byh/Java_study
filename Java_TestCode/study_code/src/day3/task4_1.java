package day3;

/**
 * @author NJR10byh
 * @date 2022/7/15 10:23:31
 * @description private保护成员变量
 */
public class task4_1 {
    String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18) {
            System.out.println("您还未成年！");
        } else {
            this.age = age;
        }
    }

    public void getInfo() {
        System.out.println(name + " " + getAge());
    }
}

package day5;

/**
 * @author NJR10byh
 * @date 2022/7/18 14:52:37
 * @description 学生类对象
 */

public class task3_Student {
    private String name;
    private int age;

    public task3_Student() {
    }

    public task3_Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

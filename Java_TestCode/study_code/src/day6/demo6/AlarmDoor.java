package day6.demo6;

/**
 * @author NJR10byh
 * @date 2022/7/19 18:26:26
 * @description 报警门只需要继承门的方法，实现报警接口即可
 */

public class AlarmDoor extends Door implements Alarm {

    @Override
    public void alarm() {
    }

    @Override
    public void open() {
    }

    @Override
    public void close() {
    }
}

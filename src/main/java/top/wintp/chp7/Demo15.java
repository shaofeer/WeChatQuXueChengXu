package top.wintp.chp7;

/**
 * description:
 * <p>
 * author:  upuptop
 * <p>
 * qq: 337081267
 * <p>
 * CSDN:   http://blog.csdn.net/pyfysf
 * <p>
 * cnblogs:   http://www.cnblogs.com/upuptop
 * <p>
 * blog:   http://wintp.top
 * <p>
 * email:  pyfysf@163.com
 * <p>
 * time: 2019/07/2019/7/24
 * <p>
 */


final class Name {
}

//class NewName extends Name {//ERROR，报错，因为Name有final修饰
//}

public class Demo15 {
    final int COUNT = 10;
    int index = 0;

    public void fun() {
        //报错 final修饰变量时，初值就是其值，不可以变化，就是常量
        //COUNT = 200;
    }

}

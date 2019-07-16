package top.wintp.chp2;

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
 * time: 2019/07/2019/7/16
 * <p>
 */
public class SwitchDemo {
    public static void main(String[] args) {
        int a = 7, b = 5;
        switch (a - b) {
            case 3://表达式可能的值；
            {
                System.out.println("33!");
            }
            break;

            case 4: {
                System.out.println("44!");
            }
            break;
            default://都没有执行则 执行该语句!
                System.out.println("其它的");
        }
    }
}

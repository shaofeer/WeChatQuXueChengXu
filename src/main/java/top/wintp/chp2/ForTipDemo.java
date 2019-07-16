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
public class ForTipDemo {

    public static void main(String[] args) {
        WC:
        for (int i = 1; i < 10; i++) {
            NC:
            for (int j = 1; j < 10; j++) {
                System.out.println(j + " * " + i + " = " + (j * i));
                if (j == 4) {
                    break WC;
                }
            }
        }
    }

    /*
    输出结果
    1 * 1 = 1
    2 * 1 = 2
    3 * 1 = 3
    4 * 1 = 4
     */

}

package top.wintp.chp4;

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
 * time: 2019/07/2019/7/18
 * <p>
 */
public class NumAndOrDemo {

    public static void main(String[] args) {
        //与运算
        System.out.println(7 & 9);
        //或运算
        System.out.println(2 | 5);
        //异或运算
        System.out.println(10 ^ 5);
        //一个数字对同一个数异或两次，数值不变
        System.out.println(10 ^ 5 ^ 5);

        System.out.println("-----");
        //右移
        System.out.println(8 >> 3);
        //左移
        System.out.println(2 << 3);
    }


    /*
    打印结果：
    1
    7
    15
    10
    -----
    1
    16
     */
}

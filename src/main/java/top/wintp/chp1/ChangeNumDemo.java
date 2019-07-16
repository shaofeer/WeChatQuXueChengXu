package top.wintp.chp1;

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
 * time: 2019/07/2019/7/15
 * <p>
 */
public class ChangeNumDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

//要求输出结果为；a = 20; b = 10;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;


        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }

}

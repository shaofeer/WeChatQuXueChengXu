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
public class DataTypeDemo {

    public static void main(String[] args) {
        //程序定义
        byte bb = 10;
        short s = 20;
        int i = 100;
        long l = 1000L;


        float f = 0.5F;
        double d = 1.5;

        boolean flag1 = true;
        boolean flag2 = false;


        //    面试踩坑


        byte a = 1;
        byte b = 1;

        //byte c = a + b;
        // int c = a + b;
        byte c = (byte) (a + b);


    }
}

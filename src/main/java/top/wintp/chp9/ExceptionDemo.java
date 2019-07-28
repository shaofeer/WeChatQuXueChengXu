package top.wintp.chp9;

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
 * time: 2019/07/2019/7/28
 * <p>
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            fn1(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        fn2(2);
    }

    public static void fn1(int a) throws Exception {
        if (a > 0) {
            throw new Exception("fn1 -- a值不合法");
        }
    }

    public static void fn2(int a) {
        if (a > 0) {
            throw new RuntimeException("a值不合法");
        }
    }

}

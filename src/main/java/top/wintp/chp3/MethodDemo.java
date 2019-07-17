package top.wintp.chp3;

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
 * time: 2019/07/2019/7/17
 * <p>
 */
public class MethodDemo {
    public static void main(String[] args) {
        int player = 5;
        System.out.println("返回的结果是：" + show(player));
    }

    public static String show(int p) {
        switch (p) {
            case 1:
                return "upuptop";
            case 2:
                return "趣学程序";
            case 3:
                return "pyfysf";
            default:
                return "爱生活爱程序";
        }
    }
}

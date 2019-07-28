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
public class Demo19 {
    public static void main(String[] args) {
        try {
            System.out.println(17 / 0);
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("程序错误，请修正！");
        } finally {
            System.out.println("这是finally代码块！");
        }
    }
}

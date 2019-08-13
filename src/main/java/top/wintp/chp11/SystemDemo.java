package top.wintp.chp11;

import java.util.Properties;

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
 * time: 2019/08/2019/8/13
 * <p>
 */
public class SystemDemo {
    public static void main(String[] args) {
        Properties p = System.getProperties();
        System.out.println(p);

        System.out.println(System.getenv());
    }

}

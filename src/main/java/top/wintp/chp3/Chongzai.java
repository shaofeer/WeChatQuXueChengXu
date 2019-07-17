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
public class Chongzai {
    public static void main(String[] args) {
        int ret = name(3, 4, 5);
        System.out.println(ret);
    }

    public static int name(int a, int b) {
        int c = a + b;
        return c;
    }

    public static int name(int a, int b, int m)//这就叫做方法的重载，只要参数列表不一样。好处：用户使用时限制很小；
    {
        int c = a + b + m;
        return c;
    }

}

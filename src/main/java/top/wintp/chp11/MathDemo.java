package top.wintp.chp11;

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
public class MathDemo {

    public static void main(String[] args) {
        //- abs(X x):求绝对值
        //        - max(X x1,X x2):求最大值
        //        - min(X x1,X x2)：求最小值
        //        - public static double random()：返回带正号的 double 值，该值大于等于 0.0 且小于 1.0。和使用new java.util.Random一样
        //        - Math.PI:π的值;

        int abs = Math.abs(-10);
        System.out.println(abs);

        int max = Math.max(19, 20);
        System.out.println(max);


        int min = Math.min(100, 90);
        System.out.println(min);

        double random = Math.random();
        //输出随随机值为0.0到1.0之间,[0,1)
        System.out.println(random);

        //    输出1到10之间的整数随机数
        int randomNum = (int) (Math.random() * 10 + 1);
        System.out.println(randomNum);

        //    输出π的值
        System.out.println(Math.PI);

    }

}

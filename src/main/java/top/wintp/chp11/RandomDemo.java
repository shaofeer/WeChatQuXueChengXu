package top.wintp.chp11;

import java.util.Random;

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
public class RandomDemo {
    public static void main(String[] args) {
        //在进行随机时，随机算法的起源数字称为种子数(seed)，
        //在种子数的基础上进行一定的变换，从而产生需要的随机数字。
        Random random1 = new Random(12);
        Random random2 = new Random(12);

        for (int i = 0; i < 10; i++) {
            //相同种子数的Random对象，相同次数生成的随机数字是完全相同的。
            System.out.println(random1.nextInt() == random2.nextInt());
            //上面的输出语句，会输出10个true
        }


        Random random3 = new Random();
        Random random4 = new Random();

        for (int i = 0; i < 10; i++) {
            //没有种子，随机
            System.out.println(random3.nextInt() == random4.nextInt());
        }
        Random random5 = new Random(1);
        Random random6 = new Random();

        for (int i = 0; i < 10; i++) {
            //种子不同，随机
            System.out.println(random5.nextInt() == random6.nextInt());
        }


        System.out.println("======================分割线======================");

        //    生成一个1-10的整数随机数
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int i1 = random.nextInt(10);
            System.out.println(i1);
        }

    }
}

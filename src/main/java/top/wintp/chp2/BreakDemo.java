package top.wintp.chp2;

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
 * time: 2019/07/2019/7/16
 * <p>
 */
public class BreakDemo {

    public static void main(String[] args) {
        //    输出1-10前4位数字与 2 的乘积，且第2位数字不参与运算输出其本身即可

        for (int i = 1; i <= 10; i++) {

            if (i == 2) {
                //    第二位数字仅仅输出  不参与运算
                System.out.println(i);
                //遇到continue 程序不会向下走
                continue;
            }


            if (i > 4) {
                //    仅仅输出前4位 大于4 即跳出循环
                // 遇到break直接结束循环
                break;
            }


            int temp = i * 2;

            System.out.println(temp);
        }
    }

}

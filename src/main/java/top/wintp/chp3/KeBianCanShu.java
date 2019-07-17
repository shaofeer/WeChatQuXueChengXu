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
public class KeBianCanShu {

    public static void main(String[] args) {
        System.out.println(sum());
        System.out.println(sum(1, 2, 3, 4, 5));
        System.out.println(sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }

    private static int sum(int... nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

}

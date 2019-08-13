package top.wintp.chp11;

import java.util.Calendar;
import java.util.Date;

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
public class Demo29 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c);

        Date d = c.getTime();
        System.out.println(d);

        /**
         * void set(int year, int month, int date, int hour, int minute, int second)
         * 设置字段 YEAR、MONTH、DAY_OF_MONTH、HOUR、MINUTE 和 SECOND 的值。
         */

        c.set(2015, 07, 15, 12, 24, 55);
        d = c.getTime();
        System.out.println(d);

        c.add(Calendar.DAY_OF_MONTH, 3);
        d = c.getTime();
        System.out.println(d);
    }
}

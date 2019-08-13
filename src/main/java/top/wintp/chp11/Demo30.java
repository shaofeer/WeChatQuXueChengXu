package top.wintp.chp11;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * description:
 * Eg：“查询距今最近三天内的记录”，这里的‘三天内’是什么时间段？
 * 将当前日期时间转换为 只获取当天的00:00:00
 * 如: 2011-08-08 12:12:12 转化为 2011-08-08 00:00:00、
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
public class Demo30 {
    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();
        Date d = c.getTime();
        System.out.println(d);

        SimpleDateFormat sd = new SimpleDateFormat("yyyy-M-d HH:mm:ss E");

        String s = sd.format(d);
        System.out.println(s);

        c.set(2015, 8, 23, 13, 24, 15);
        d = c.getTime();
        System.out.println(sd.format(d));
        c.add(Calendar.DAY_OF_MONTH, -3);
        d = c.getTime();
        System.out.println(sd.format(d));
    }
}

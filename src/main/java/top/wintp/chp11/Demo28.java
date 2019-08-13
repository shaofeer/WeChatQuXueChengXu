package top.wintp.chp11;

import java.text.SimpleDateFormat;
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
public class Demo28 {
    public static void main(String[] args) throws Exception {

        Date d = new Date();
        System.out.println(d);//获取当前时间

        //格式化
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-M-d HH:mm:ss E");

        String s = sd.format(d);//这个方法继承于SimpleDateFormat的父类DateFormat类！
        System.out.println(s);

        //反格式化
        d = sd.parse(s);
        System.out.println(d);
    }
}

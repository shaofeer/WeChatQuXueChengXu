package top.wintp.chp10_string;

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
public class Demo5 {
    public static void main(String[] args) {

        String s = "";
        long begintime = System.currentTimeMillis();
        for(int i = 1;i <= 100000;i++){
            s += i;
        }


        long endtime = System.currentTimeMillis();
        long time = endtime - begintime;
        System.out.println("运行时间为："+time);

        StringBuffer s1 = new StringBuffer();
        s = "";
        begintime = System.currentTimeMillis();
        for(int i = 1;i <= 100000;i++){
            s = ""+i;
            s1 = new StringBuffer(s);
        }

        endtime = System.currentTimeMillis();
        time = endtime - begintime;
        System.out.println("运行时间为："+time);

    }
}

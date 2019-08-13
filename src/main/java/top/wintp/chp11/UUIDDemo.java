package top.wintp.chp11;

import java.util.UUID;

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
public class UUIDDemo {
    public static void main(String[] args) {
        UUID u = UUID.randomUUID();
        String s = u.toString();
        System.out.println(s);//此时是随机生成的，肯定每次都不一样，全网唯一！

        u = new UUID(1222222222, 12);//根据构造方法来
        s = u.toString();
        System.out.println(s);//这一个的UUID是固定的。
    }

}

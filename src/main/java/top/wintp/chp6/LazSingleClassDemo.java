package top.wintp.chp6;

import org.junit.Test;

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
 * time: 2019/07/2019/7/24
 * <p>
 */
public class LazSingleClassDemo {

    private static LazSingleClassDemo mLazSingleClassDemo = null;

    private LazSingleClassDemo() {
        System.out.println("创建懒加载模式的对象");
    }

    public static LazSingleClassDemo getmLazSingleClassDemo() {

        if (mLazSingleClassDemo == null) {
            mLazSingleClassDemo = new LazSingleClassDemo();
        }

        return mLazSingleClassDemo;
    }

    public static String otherMehod() {

        return "otherMehod otherMehod";
    }
}


class TestSingleClassDemo2 {
    @Test
    public void testInstance() {

        //    懒加载模式
        //在懒加载模式中 调用该类的其他方法并不会创建该类的对象
        String string = LazSingleClassDemo.otherMehod();
        System.out.println(string);
        //打印结果：otherMehod otherMehod
    }
}


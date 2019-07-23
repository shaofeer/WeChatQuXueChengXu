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
public class EndSingleClassDemoEnd {

    private static EndSingleClassDemoEnd mLazSingleClassDemo = null;

    private EndSingleClassDemoEnd() {
        System.out.println("创建懒加载模式的对象");
    }


    /**
     * 静态内部类
     */
    private static class EndSingleClassDemoHolder {
        private static EndSingleClassDemoEnd mLazSingleClassDemo = new EndSingleClassDemoEnd();
    }

    public static EndSingleClassDemoEnd getmLazSingleClassDemo() {

        return EndSingleClassDemoHolder.mLazSingleClassDemo;
    }

    public static String otherMehod() {

        return "otherMehod otherMehod";
    }
}


public class TestSingleClassDemo {
    @Test
    public void testInstance() {
        new Thread("t1") {
            public void run() {
                EndSingleClassDemoEnd endSingleClassDemo = EndSingleClassDemoEnd.getmLazSingleClassDemo();
                System.out.println(this.getName());
                System.out.println(endSingleClassDemo);
            }
        }.start();
        new Thread("t2") {
            public void run() {
                EndSingleClassDemoEnd endSingleClassDemo = EndSingleClassDemoEnd.getmLazSingleClassDemo();
                System.out.println(this.getName());
                System.out.println(endSingleClassDemo);
            }
        }.start();
        new Thread("t3") {
            public void run() {
                EndSingleClassDemoEnd endSingleClassDemo = EndSingleClassDemoEnd.getmLazSingleClassDemo();
                System.out.println(this.getName());
                System.out.println(endSingleClassDemo);
            }
        }.start();
        new Thread("t4") {
            public void run() {
                EndSingleClassDemoEnd endSingleClassDemo = EndSingleClassDemoEnd.getmLazSingleClassDemo();
                System.out.println(this.getName());
                System.out.println(endSingleClassDemo);
            }
        }.start();
        new Thread("t5") {
            public void run() {
                EndSingleClassDemoEnd endSingleClassDemo = EndSingleClassDemoEnd.getmLazSingleClassDemo();
                System.out.println(this.getName());
                System.out.println(endSingleClassDemo);
            }
        }.start();


        long beginTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            EndSingleClassDemoEnd endSingleClassDemo = EndSingleClassDemoEnd.getmLazSingleClassDemo();
        }
        long endTime = System.currentTimeMillis();

        System.out.println("用时间:" + (endTime - beginTime));

        /*
        打印结果如下：

        创建懒加载模式的对象
        t1
        t2
        t3
        top.wintp.demo.EndSingleClassDemoEnd@4dbb3e34
        top.wintp.demo.EndSingleClassDemoEnd@4dbb3e34
        top.wintp.demo.EndSingleClassDemoEnd@4dbb3e34
        t4
        top.wintp.demo.EndSingleClassDemoEnd@4dbb3e34
        t5
        top.wintp.demo.EndSingleClassDemoEnd@4dbb3e34
        用时间:1
         */

    }
}




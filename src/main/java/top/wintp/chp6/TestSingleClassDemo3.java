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
public class TestSingleClassDemo3 {
    @Test
    public void testInstance() {
        //    懒加载模式的线程并发问题
        new Thread("t1") {
            public void run() {
                LazSingleClassDemo lazSingleClassDemo = LazSingleClassDemo.getmLazSingleClassDemo();
                System.out.println(this.getName());
                System.out.println(lazSingleClassDemo);
            }
        }.start();
        new Thread("t2") {
            public void run() {
                LazSingleClassDemo lazSingleClassDemo = LazSingleClassDemo.getmLazSingleClassDemo();
                System.out.println(this.getName());
                System.out.println(lazSingleClassDemo);
            }
        }.start();
        new Thread("t3") {
            public void run() {
                LazSingleClassDemo lazSingleClassDemo = LazSingleClassDemo.getmLazSingleClassDemo();
                System.out.println(this.getName());
                System.out.println(lazSingleClassDemo);
            }
        }.start();
        new Thread("t4") {
            public void run() {
                LazSingleClassDemo lazSingleClassDemo = LazSingleClassDemo.getmLazSingleClassDemo();
                System.out.println(this.getName());
                System.out.println(lazSingleClassDemo);
            }
        }.start();

        new Thread("t5") {
            public void run() {
                LazSingleClassDemo lazSingleClassDemo = LazSingleClassDemo.getmLazSingleClassDemo();
                System.out.println(this.getName());
                System.out.println(lazSingleClassDemo);
            }
        }.start();


        /*
		打印结果如下：

        创建懒加载模式的对象
        创建懒加载模式的对象
        t2
        top.wintp.demo.LazSingleClassDemo@475f260c
        t1
        top.wintp.demo.LazSingleClassDemo@55b9171e
        t3
        top.wintp.demo.LazSingleClassDemo@475f260c
        t4
        top.wintp.demo.LazSingleClassDemo@475f260c
        t5
        top.wintp.demo.LazSingleClassDemo@475f260c
         */
    }
}


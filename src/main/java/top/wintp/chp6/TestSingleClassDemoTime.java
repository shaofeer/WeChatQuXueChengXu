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
public class TestSingleClassDemoTime {

    @Test
    public void testInstance() {
        long beginTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            LazSingleClassDemo lazSingleClassDemo = LazSingleClassDemo.getmLazSingleClassDemo();
        }
        long endTime = System.currentTimeMillis();

        System.out.println(endTime - beginTime);
        //懒加载模式 不同步方法 用时间：    2


        beginTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            LazSingleSyncClassDemo lazSingleClassDemo = LazSingleSyncClassDemo.getmLazSingleClassDemo();
        }
        endTime = System.currentTimeMillis();

        System.out.println(endTime - beginTime);
        //懒加载模式 同步方法 用时间：    5

    }
}

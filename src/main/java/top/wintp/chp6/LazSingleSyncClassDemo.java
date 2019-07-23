package top.wintp.chp6;

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

public class LazSingleSyncClassDemo {

    private static LazSingleSyncClassDemo mLazSingleClassDemo = null;

    private LazSingleSyncClassDemo() {
        System.out.println("创建懒加载模式同步方法的对象");
    }

    //使用synchronized 关键字
    public static synchronized LazSingleSyncClassDemo getmLazSingleClassDemo() {

        if (mLazSingleClassDemo == null) {
            mLazSingleClassDemo = new LazSingleSyncClassDemo();
        }

        return mLazSingleClassDemo;
    }

    public static String otherMethod() {

        return "otherMethod otherMethod";
    }
}


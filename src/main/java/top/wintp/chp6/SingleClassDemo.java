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
public class SingleClassDemo {

    //第一种方式 直接创建对象 需要时直接返回
    public static SingleClassDemo sSingleClassDemo = new SingleClassDemo();

    private SingleClassDemo() {
        System.out.println("创建单例对象");
    }


    public static SingleClassDemo getInstance() {
        return sSingleClassDemo;
    }


    // 该类中的其他静态方法
    public static String otherMethod() {
        return "otherMethod otherMethod!";
    }

}

/**
 * 测试类
 */
class TestSingleClassDemo {
    @Test
    public void testInstance() {

        SingleClassDemo instance = SingleClassDemo.getInstance();
        System.out.println(instance);
        //打印结果：创建单例对象  top.wintp.demo.SingleClassDemo@50486d1d

        //当调用该类的其他方法的时候，会初始化该类该类的静态变量 创建对象
        String string = SingleClassDemo.otherMethod();
        System.out.println(string);
        //打印结果：创建单例对象        cotherMethod otherMethod!
    }
}



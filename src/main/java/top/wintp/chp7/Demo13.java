package top.wintp.chp7;

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
public class Demo13 {
    Demo13() {
        System.out.println("我是构造方法！");
    }

    {
        System.out.println("我是构造代码块！");//实例化对象的时候才会去调用！
    }

    static {
        System.out.println("我是静态代码块！");
    }

    public static void main(String[] args) {
        new Demo13();
        new Demo13();//再次创建对象，证明无论创建几次对象，静态代码块都只执行一次
        System.out.println("我是普通代码块！");
    }
}

package top.wintp.chp5;

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
 * time: 2019/07/2019/7/22
 * <p>
 */
public class A {

    public static void fun1() {
        System.out.println("fun1");
    }

    public void fun2() {
        System.out.println("fun2");
    }

    public static void main(String[] args) {
        ((A) null).fun1();
        //((A) null).fun2();
        A a = (A) null;
        System.out.println(a);
        a.fun1();

        A a2 = null;
        a2.fun1();
    }

}

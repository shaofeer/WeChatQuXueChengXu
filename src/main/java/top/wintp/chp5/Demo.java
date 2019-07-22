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

public class Demo {

    private static int sum = 0;

    private int count = 0;

    public static void main(String[] args) {
        //编译不通过，静态方法只能访问静态变量，
        // 因为静态变量和静态方法是随着类加载而加载的，count是属于对象的属性，
        // 此时对象还没有创建，所以不能访问
        //System.out.println(count);
        //编译可以通过
        System.out.println(sum);


        //    静态方法和静态变量，都可以直接通过类名直接调用，不需要创建类对象
        Demo.fun2();
        System.out.println(Demo.sum);


        //    普通方法和变量需要创建该类的对象才能调用
        Demo demo = new Demo();
        demo.fun1();
        System.out.println(demo.count);

        //    static变量，对象间共享
        Demo demo1 = new Demo();
        demo1.sum++;

        System.out.println("demo1.sum:" + demo1.sum);//打印 1

        Demo demo2 = new Demo();
        System.out.println("demo2.sum:" + demo2.sum);//打印 1
        demo2.sum++;
        System.out.println("demo2.sum：" + demo2.sum);//打印2
        System.out.println("demo1.sum: " + demo1.sum);//打印2

    }


    public void fun1() {

        //编译正常，先有类后有对象，
        // fun1()方法是属于对象的方法，所以可以调用静态的成员变量
        System.out.println(sum);
        //编译正常
        fun2();

    }

    public static void fun2() {
        System.out.println("静态方法fun2");
        //编译不通过
        //fun1();
    }
}

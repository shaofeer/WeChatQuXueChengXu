package top.wintp.chp8;

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
 * time: 2019/07/2019/7/25
 * <p>
 */

interface IA {
    void a();
}

interface IB {
    void b();
}

class ABImpl implements IA, IB {

    @Override
    public void a() {
        System.out.println("a");
    }

    @Override
    public void b() {
        System.out.println("b");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        //接口不能创建实例，但是可以声明引用类型的变量。
        IA ia = new ABImpl();
        IB ib = new ABImpl();

        ia.a();
        ib.b();


        IA innerIa = new IA() {
            @Override
            public void a() {
                System.out.println("inner a");
            }
        };

        IB innerIb = new IB() {
            @Override
            public void b() {
                System.out.println("inner b");
            }
        };

        innerIa.a();
        innerIb.b();
    }
}

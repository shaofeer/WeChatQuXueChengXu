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
 * time: 2019/07/2019/7/23
 * <p>
 */
public class StudentDemo {
    public static void main(String[] args) {
        //Person p = new Person();
        //p.setName("TOM");
        //p.setAge(20);
        //System.out.println("我是：" + p.getName() + ",今年" + p.getAge() + "岁。");


        //Student s = new Student();
        //Student中并没有显示的定义setName和setAge这两个方法，为什么可以使用呢？
        //因为Student继承自Person，所以可以使用父类中的非私有属性和非私有方法
        //在开发中，我们在优化代码的过程中，经常会将某几类共有的属性和方法向上提取，构造一个父类
        //s.setName("Lucy");
        //s.setAge(18);
        //s.setNumber("20180978");
        //System.out.println("我是：" + s.getName() + ",今年" + s.getAge() + "岁,我的学号是：" + s.getNumber());


        //    使用无参构造创建Student的对象
        new Student();
        //    使用有参构造创建Student的对象
        new Student("100101");


        Person ps = new Student();
        ps.setAge(123);

        Student ss = (Student) ps;


        Person pw = new Worker();

        if (pw instanceof Student) {
            Student sss = (Student) pw;
        }

    }

}

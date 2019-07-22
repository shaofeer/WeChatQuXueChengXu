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
public class Person {
    //属性
    private String name;
    private int age;
    private int sal;
    //方法
    public void show(){
        System.out.println("个人情况："+name+age+sal);
    }

    /*
        一个参数的构造方法
    */
    public Person(String name) {
        super();
        this.name = name;
    }

    /*
        两个个参数的构造方法
    */
    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, int sal) {
        super();
        this.name = name;
        this.age = age;
        this.sal = sal;
    }
}

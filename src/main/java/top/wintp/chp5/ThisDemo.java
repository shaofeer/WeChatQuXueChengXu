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
public class ThisDemo {

    private String name;
    private int age;

    public ThisDemo() {
    }

    public ThisDemo(String name, int age) {
        //如果 方法的形参和当前类中属性的名称相同，那么可以使用this来区分
        this.name = name;
        this.age = age;
    }

    public void whoAmI() {
        //谁调用这个方法 this 就代表是谁
        System.out.println("我是：" + this.name + ",我今年：" + this.age);
    }


    /*
    对于一个类，如果其属性使用private
    可以通过定义getset方法进行赋值和获取
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        ThisDemo upUptop = new ThisDemo("upuptop", 12);
        ThisDemo tom = new ThisDemo();
        tom.setName("TOM");
        tom.setAge(22);

        upUptop.whoAmI();//我是：upuptop,我今年：12
        tom.whoAmI();//我是：TOM,我今年：22
    }
}

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
public class Student extends Person {

    private String number;

    public Student() {
        System.out.println("Student无参构造方法");
    }

    public Student(String number) {
        System.out.println("Student的有参构造");
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void study() {
        System.out.println("study");
    }

    @Override
    public void setAge(int age) {
        System.out.println("Student类对setAge()方法自定义");
        super.setAge(age);
    }

}

package top.wintp.chp9;

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
 * time: 2019/07/2019/7/28
 * <p>
 */
public class MyExceptionDemo {

    public static void main(String[] args) throws MyException {

        String username = "123";
        String password = "123";

        if ("root".equals(username) && "root".equals(password)) {
            System.out.println("用户名密码正确");
        } else {
            throw new MyException("用户名或密码错误");
        }
    }

}

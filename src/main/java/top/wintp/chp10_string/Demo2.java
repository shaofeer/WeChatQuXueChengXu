package top.wintp.chp10_string;

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
 * time: 2019/08/2019/8/13
 * <p>
 */
public class Demo2 {
    public static void main(String[] args) {

        String s1 = "";
        System.out.println(isimpty(s1));

    }

    public static String isimpty(String s){

        if(s != null && !"".equals(s)){
            return "不为空";
        }
        return "为空！";
    }
}

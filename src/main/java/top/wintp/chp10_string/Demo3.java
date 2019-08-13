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
public class Demo3 {
    public static void main(String[] args) {
        String s1 = "123456789";
        String s2 = "12345  6789";
        System.out.print(isnum(s1));
        System.out.print(isnum(s2));
    }

    public static boolean isnum(String s){
        //将字符串参数转为字符数组
        char []ch = s.toCharArray();
        //循环字符数组，判断每一个元素是否在数字对应的字符区间内
        for (char c : ch) {
            //判断字符是否在[0-9]这个区间内部
            if(!(c > '0' && c <= '9')){
                return false;
            }
        }
        return true;
    }
}

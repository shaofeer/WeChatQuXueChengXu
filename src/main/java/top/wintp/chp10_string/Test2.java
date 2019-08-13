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
public class Test2 {
    public static void main(String[] args) {
        int []i = {1,2,3,4,5};
        StringBuilder sb = new StringBuilder();
        for (int j : i) {
            sb.append(j).append(",");
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb);
    }

}

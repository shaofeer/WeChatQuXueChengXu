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
public class Test1 {
    public static void main(String[] args) {
        //第一种方法：往里面插入；
        StringBuilder sb = new StringBuilder("ABCDE");
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb);
        for (int i = 0; i < sb.length(); i+=2) {
            sb.insert(i, ",");
        }
        sb.deleteCharAt(0);

        System.out.println(sb);


        //第二种方法：往里面追加，要追加必须遍历，必须换为数组！
        sb = new StringBuilder("ABCDE");
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb);
        char []cs = sb.toString().toCharArray();
        StringBuilder sb1 = new StringBuilder();
        for (char c : cs) {
            sb1.append(c).append(",");
        }
        sb1.deleteCharAt(sb1.length()-1);
        System.out.println(sb1);
    }

}

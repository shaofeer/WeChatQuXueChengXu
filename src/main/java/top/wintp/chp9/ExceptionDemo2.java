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
public class ExceptionDemo2 {

    public static void buy(String price) throws Exception {
        try {
            if (price != null)
                Double.parseDouble(price);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("价格不能只能是数字组成");
        }
    }

    public static void main(String[] args) {
        try {
            buy(null);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}

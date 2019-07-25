package top.wintp.chp8;

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
 * time: 2019/07/2019/7/25
 * <p>
 */


//枚举
enum Color {
    Green, Blue, Yellow;

    @Override
    public String toString() {
        String ret = super.toString();
        switch (this) {
            case Green:
                ret = "绿色";
                break;

            case Blue:
                ret = "蓝色";
                break;

            case Yellow:
                ret = "黄色";
                break;

            default:
                break;
        }

        return ret;
    }

}

class Personp {
    Color c = Color.Blue;

    void show() {
        System.out.println(c);
    }
}

public class Demo18 {
    public static void main(String[] args) {
        Color[] color = Color.values();
        for (Color c : color) {
            System.out.println(c);
        }
        new Personp().show();
    }
}


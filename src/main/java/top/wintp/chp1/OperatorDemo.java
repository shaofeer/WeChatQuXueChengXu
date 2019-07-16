package top.wintp.chp1;

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
 * time: 2019/07/2019/7/15
 * <p>
 */
public class OperatorDemo {

    public static void main(String[] args) {

        int a = 10;
        int b = 2;

        //    运算符
        //算术运算符（+ 、— 、* 、/ 、%）
        int addRes = a + b;//12
        int dRes = a - b;//8
        int cRes = a * b;//20
        int ddRes = a / b;//5
        int aaRes = a % b;//0
        int resubb = 10 % 3;//1

        //赋值运算符（= 、+=、-=、*=、/=,、%=）

        int c = 100;
        int d = 200;

        c += d;
        //输出300
        System.out.println(c);

        c -= d;
        //输出100
        System.out.println(c);

        c *= d;
        //输出 20000
        System.out.println(c);

        c /= d;
        //100
        System.out.println(c);

        c %= d;
        //100
        System.out.println(c);


        //关系运算符（>、>=、<、<=、!=）

        int e = 10;
        int f = 20;

        // 结果false
        System.out.println(e > f);
        // 结果false
        System.out.println(e >= f);
        //结果true
        System.out.println(e < f);
        //结果true
        System.out.println(e <= f);
        //结果true
        System.out.println(e != f);

        System.out.println("条件运算符");

        //条件运算符（&&、||、！、&、|、^）
        int h = 10;
        int i = 20;

        //结果false
        //从左往右运算 (h>i)是真的吗？ 结果是false  遇到&& 直接返回false不会走右边的表达式，形成短路
        System.out.println((h > i) && (h != 10));
        //结果false
        //从左往右运算 (h<i)是真的吗？ 结果是true  遇到&& 判断右侧表达式，右侧表达式为true则返回true，false则返回false
        System.out.println((h < i) && (h != 10));
        //从左往右运算 (h>i)是真的吗？ 结果是false  遇到 || 判断右侧表达式是否为真，如果是真的返回true,false 则返回false
        //结果true
        System.out.println((h > i) || (h == 10));
        //从左往右运算 (h<i)是真的吗？ 结果是true 遇到 || 直接返回true 不会运行右边的表达式 形成短路
        //结果true
        System.out.println((h < i) || (h != 10));

        //结果false
        //从左往右运算 (h>i)是真的吗？ 结果是false  遇到 & 返回false,但是执行右侧表达式
        System.out.println((h > i) & (h != 10));
        //结果false
        //从左往右运算 (h<i)是真的吗？ 结果是true  遇到& 判断右侧表达式，右侧表达式为true则返回true，false则返回false
        System.out.println((h < i) & (h != 10));
        //从左往右运算 (h>i)是真的吗？ 结果是false  遇到 | 判断右侧表达式是否为真，如果是真的返回true,false 则返回false
        //结果true
        System.out.println((h > i) | (h == 10));
        //从左往右运算 (h<i)是真的吗？ 结果是true 遇到 | 直接返回true 不会运行右边的表达式
        //结果true
        System.out.println((h < i) | (h != 10));

        //结果 true
        System.out.println(!(h != 10));
        //10
        System.out.println(h ^ i ^ i);
        //true
        System.out.println((h ^ i ^ i) == h);


        //位运算符（&、|、^、~、>>、<<、<<<、>>>）
    }

}

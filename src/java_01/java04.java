package java_01;

/**
 * Created by zhaoyingxiang on 2017/7/16 - 18:09.
 */
public class java04 {
    public static void main(String[] args) {
        char a1 = '我';
        char a2 = '是';
        char a3 = '好';
        char a4 = '人';

        System.out.println("我是谁："+a1+a2+a3+a4);

        short x = 22;
        int y = 022;
        long z = 0x22l;
        System.out.println("转化成十进制："+x+"x\n"+y+"y\n"+z+"z\n");

    //浮点型
        float a = 0.11f;
        double b = 10 ;
        System.out.println("计算乘积："+a*b);
    }
}

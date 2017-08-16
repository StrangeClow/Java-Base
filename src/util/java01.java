package util;

/**
 * User: zyx
 * Date: 2017/8/16 18:02
 * 常用的java包
 * 1 java.lang
 * 2.java.io
 * 3.java.util
 * 4.java.swing
 * 5.java.net     含有与网络操相关的类
 * 6.jaav.applet   含有控制html文档的格式
 * 7.java.beans    定义了应用程序接口
 * obejct是java类的祖先
 */
public class java01 {
    public static void main(String[] args) {
        int a;
        System.out.println("随机数为：");
        for (int i = 1; i < 10; i++) {
            a=(int)((100-10+1)*Math.random()*10+3);
            System.out.println(""+a);
        }
        System.out.println();
    }

}

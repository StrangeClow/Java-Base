package java_02;

/**
 * Created by zhaoyingxiang on 2017/7/20 - 20:14.
 */
public class java11Test {
    public static void main(String[] args) {
        java11 j = new java11("张三");
        java11 j2 = new java11("李四");

        j.age = 10;
        j.score =148.50;

        j2.age = 15;
        j2.score = 18.00;

        j.printJava11();
        j2.printJava11();
    }
}

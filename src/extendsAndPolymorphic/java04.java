package extendsAndPolymorphic;/*
* @author zhaoyingxiang
* @description
* @Date Createed in  2017/8/8 22:24
* @modidied by 
*/

public class java04 {
    static int i = 10;
    int j;
    java04() {
        this.j = 20;
    }


    public static void main(String[] args) {
        System.out.println("类变量i "+java04.i);
        java04 obj = new java04();
        System.out.println("实例变量j "+obj.j);
    }
}

package extendsAndPolymorphic;/*
* @author zhaoyingxiang
* @description
* @Date Createed in  2017/8/8 22:58
* @modidied by 
*/

public final class java_final {
    public static final int TOTAL_NUMBER = 5;
    public int id;
    public java_final (){
       // id =++TOTAL_NUMBER;  final变量不能进行二次赋值
    }

    public static void main(String[] args) {
        final java_final  f= new java_final();
        final  int i = 10;
        final int j;
        j =20;
        //  j = 30;   //错误，对final变量进行二次赋值
    }
}
//在java中 被static和private修饰的方法会被隐室的声明为final
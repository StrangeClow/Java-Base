package extendsAndPolymorphic;

/**
 * Created by zhaoyingxiang on 2017/7/27 - 22:54.
 * @version 1.20
 * @author zyx
 */
public class java03 {
    public static void main(String[] args) {
        superClass  supe = new superClass();
        sonClass son  =new sonClass();


    }
}

class superClass {

int age;
    /**
     * a function
     * @param name 姓名
     */
    public String name ;

}

 class sonClass extends superClass {

 }
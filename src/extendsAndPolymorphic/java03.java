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


    /**
     * a function
     * @param name 姓名
     */
    public String name ;
    public int ag;

}

//子类继承父类

 class sonClass extends superClass {

 }

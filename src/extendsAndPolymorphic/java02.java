package extendsAndPolymorphic;

/**
 * Created by zhaoyingxiang on 2017/7/26 - 11:49.
 */
public class java02 {
    public static void main(String[] args) {
        //引用poople类的实例
        peop p  =new peop();
        if (p instanceof Object) {
            System.out.println("我是一个对象");
        }
        if (p instanceof  peop) {
            System.out.println("我是一个人");
        }
        if (p instanceof  teac) {
            System.out.println("我是一个教师");
        }
        if(p instanceof president){
            System.out.println("我是校长");
        }
        System.out.println("-------------");

        //引用teac类的实例
        p = new teac();
        if (p instanceof  Object) {
            System.out.println("我是一个对象");
        }
        if (p instanceof  peop) {
            System.out.println("我是一个人类");
        }
        if (p instanceof  teac) {
            System.out.println("我是一个教师");
        }
        if (p instanceof  president) {
            System.out.println("我是一个校长");
        }

        System.out.println("-------------");

        //引用president类的实例
        p = new president();
        if (p instanceof Object) {
            System.out.println("我是一个对象");
        }
        if (p instanceof peop) {
            System.out.println("我是一个人类");
        }
        if (p instanceof teac) {
            System.out.println("我是一个教师");
        }
        if (p instanceof president) {
            System.out.println("我是一个校长");
        }
    }
}
class  peop {

}
class teac extends peop {

}
class president extends teac {

}
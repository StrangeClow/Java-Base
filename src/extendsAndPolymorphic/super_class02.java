package extendsAndPolymorphic;

/**
 * Created by zhaoyingxiang on 2017/7/20 - 22:41.
 */
public class super_class02 {
    public static void main(String[] args) {
A a =new A();
a.say();
a = new B();
a.say();
a = new C();
a.say();
    }
}
class A {
    public void say() {
        System.out.println("how to ask");
    }
}
class B extends A{
    public void say() {
        System.out.println("汪汪汪");
    }
}

class C extends A{
    public  void say() {
        System.out.println("喵喵喵");
    }
}

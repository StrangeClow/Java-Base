package java_02;

/**
 * Created by zhaoyingxiang on 2017/7/18 - 20:40.
 */
public class java04{
     void bark() {
        System.out.println("汪汪，不要过来");
    }
}
class Teddy extends java04{  // 泰迪
     void bark() {
        System.out.println("汪汪，我好怕，不要跟着我");
    }

    public static void main(String[] args) {
        Teddy t= new Teddy();
        t.bark();
    }
}
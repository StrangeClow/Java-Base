package extendsAndPolymorphic;

/**
 * Created by zhaoyingxiang on 2017/7/25 - 22:44.
 */
public class Polymorphism {
    public static void main(String[] args) {
cat c= new cat();
c.say();
c=new fish();
c.say();
c =new yet();
c.say();
    }
}
class cat {
    public void say () {
        System.out.println("你好");
    }
}
class fish extends cat {
    public  void say () {
        System.out.println("cat eat fish");
    }
}
class yet extends  cat {
    public void say () {
        System.out.println("yet eating fish");
    }
}

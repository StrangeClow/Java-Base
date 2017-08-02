package extendsAndPolymorphic;

/**
 * Created by zhaoyingxiang on 2017/7/20 - 22:20.
 */
public class super_class01 {
    public static void main(String[] args) {
Animal A = new Animal(12);
A.say();
Dog D = new Dog(56);
D.say();
    }
}
class Animal {
    int age;

    public Animal(int age) {
        this.age = age;
    }

    void say() {
        System.out.println("汪汪汪");


    }
}
class Dog extends Animal {
    public  Dog(int age) {
        super(age);
    }
    void  say() {
        System.out.println("嘎嘎嘎"+age);
    }

}

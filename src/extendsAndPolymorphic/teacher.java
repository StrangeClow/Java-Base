package extendsAndPolymorphic;

/**
 * Created by zhaoyingxiang on 2017/7/20 - 20:31.
 */
public class teacher extends people {
    String school;
    String subject;

  public  void say() {
      System.out.println("我的姓名为"+name+"学校为"+school+"所授学科为："+subject);


    }

    void eat() {
        System.out.println("我好饿 想吃饭了"+age);
    }

    public static void main(String[] args) {
        teacher t = new teacher();
        people p = new people();
        p.A = 'B';
        p.age=34;
        p.name="魔方";
        p.say();

        t.subject="语文";
        t.school="汉江师范学院";
        t.age = 18;
        t.name="湖北汽车工业学院";
        t.eat();
        t.say();
    }
}

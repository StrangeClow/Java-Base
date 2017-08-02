package java_02;

/**
 * Created by zhaoyingxiang on 2017/7/20 - 20:03.
 */
public class java11 {
    int age ;
    String name ;
    double score;
   //构造函数
    public java11(String name) {
        this.name = name;
    }
    public  void java11(int empAge) {
        age = empAge;
    }
    public void java11(double A)  {
         score = A;
    }
    public void printJava11() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(score);
    }
}

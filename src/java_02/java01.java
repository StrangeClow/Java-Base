package java_02;

/**
 * Created by zhaoyingxiang on 2017/7/17 - 23:05.
 */
public class java01 {
    int age;
    double score;
    String name;



    void study() {
        System.out.println("i like study！");
    }

    void hungry () {
        System.out.println("我有点饿l");
    }

    public static void main(String[] args) {
        java01 j = new java01();
        j.score = 23.67;
        int age = j.age;
        double score = j.score;
        String name = j.name;
        j.study();
        j.hungry();

        System.out.println("我叫："+name+"我今年"+age+"高考英语为："+score);
    }
}

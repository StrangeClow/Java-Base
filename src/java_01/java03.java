package java_01;


/**
 * Created by zhaoyingxiang on 2017/7/16 - 17:46.
 */
public class java03 {
    public static void main(String[] args) {
        class student {
            int age ;
            String name ;
            int scroe;

            void say () {
                System.out.println(name+"姓名是"+age+"年龄是"+"分数是"+scroe);
            }

        }
        student s = new student();
        s.name = "赵应祥 change "; 
        s.age = 18;
        s.scroe =100;
        s.say();
    }
}

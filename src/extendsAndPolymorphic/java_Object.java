package extendsAndPolymorphic;

/*
* @author zhaoyingxiang
* @description
* @Date Createed in  2017/8/8 23:15
* @modidied by 
*/public class java_Object {
    private int age;
    public class inner {
        private  int count = 0;
        public  void doStuff() {
            age++;
        }
    }
//内部类外部类
    public static void main(String[] args) {
        java_Object o =new java_Object();
        inner i =o.new inner();
        i.doStuff();
        System.out.println(o.age);
      //  System.out.println(i.age);
        //编译出错 外部类不能访问内部类的变量
     //   System.out.println(age.size);
    }

}

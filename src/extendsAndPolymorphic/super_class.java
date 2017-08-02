package extendsAndPolymorphic;

/**
 * Created by zhaoyingxiang on 2017/7/20 - 21:01.
 */
public class super_class {
    public static void main(String[] args) {
        dog d = new dog();
        d.say();
    }
}
    class animal {
        private String desc = "A dog is a friend of people";

        public String getDesc() {
            return desc;
        }


        void say() {
            System.out.println("hell oworld");
        }
}
    class dog extends  animal {
        void say() {
            super.say();
            System.out.println("哈哈");
            //通过getter方法调用父类影藏变量
            System.out.println(super.getDesc());
        }
    }



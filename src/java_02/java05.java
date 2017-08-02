package java_02;

/**
 * Created by zhaoyingxiang on 2017/7/18 - 21:01.
 */
public class java05 {
    public static String name= "我好烦啊啊";
    public  int i;
    {
        int j = 2;
    }
    public  void test() {
        int j =3;
        if (j == 3) {
int k  =5;
        }
        System.out.println(name+i+j);
    }

    public static void main(String[] args) {
        System.out.println(java05.name);

        java05 j = new java05();
        j.test();
    }
}

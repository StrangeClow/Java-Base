package java_02;

/**
 * Created by zhaoyingxiang on 2017/7/19 - 23:12.
 */
public class java10 {
    void T () {
        System.out.println("nothing");
    }
    void T (int A) {
        System.out.println("hello world:"+A);
    }
    void T (int B,String C) {
        System.out.println("big:"+B+C);
    }
    String T(String D) {
        System.out.println("biu:"+D);
        return D+'z';
    }

    public static void main(String[] args) {
        java10 j = new java10();
        j.T();
        j.T(10);
        j.T(58,"集美之光科技");
        j.T("hello");

    }
}

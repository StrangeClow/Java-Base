package java_01;

/**
 * Created by zhaoyingxiang on 2017/7/17 - 22:37.
 */
public class java12 {
    public static void main(String[] args) {
        String s = new String("abcdefghijklmnopqrstuvwxyz");
        long timestarts1 = System.currentTimeMillis();
        String s1 = "";
        for (int i = 0; i <1000 ; i++) {
              s1+=s;
        }

        long timestarts2 = System.currentTimeMillis();
        System.out.println("String耗费的时间为："+(timestarts2-timestarts1));


        StringBuffer sb = new StringBuffer("abcdefghijklmnopqrstuvwxyz");
        long timestarts3 = System.currentTimeMillis();
        StringBuffer str2 = new StringBuffer();
        for (int i = 0; i <1000 ; i++) {
            str2.append(sb);
        }

        long timestarts4 = System.currentTimeMillis();
        System.out.println("StringBuffer耗费的时间为："+(timestarts4-timestarts3));

    }
}

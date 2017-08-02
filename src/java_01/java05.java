package java_01;

/**
 * Created by zhaoyingxiang on 2017/7/16 - 18:22.
 */
public class java05 {
    public static void main(String[] args) {
        boolean a = 100 > 20 ;
        boolean b = 100 < 10 ;

        System.out.println("100>20"+a);
        System.out.println("100<20"+b);

        if (a) {
            System.out.println("100<20是对的");
        }
      if (b) {
          System.out.println("100>20是对的");
      }

        int x;
        double y;
        x = (int)34.56 + (int)11.2;  // 丢失精度
        y = (double)x + (double)10 + 1;  // 提高精度
        System.out.println("x=" + x);
        System.out.println("y=" + y);


        float c = 10.7f;
        int d = (int)c;
        System.out.println(d);

    }
}

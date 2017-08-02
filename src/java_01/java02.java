package java_01;

/**
 * Created by zhaoyingxiang on 2017/7/10 - 22:52.
 */
public class java02 {
    public static void main (String [] args) {
        int a= 100;
        System.out.println(a);



        char b = 'b';
        int c = b + 2;
        char d = (char)c;
        System.out.println(d);

        char c4 = 'b';
        int i = b + 3;
        char c5 = (char)i;
        System.out.println(c5);


        for (int j = -1; j < 26; j++) {
              char temp = (char)(c4 + j);
            System.out.print("temp的值为："+temp+"\n");
        }

        boolean e = true;
        if (false)
            System.out.println("helo world");


        for (int q = 1; q < 10; q++) {

            for (int w = 1; w <= q; w++) {
                System.out.print(q+"*"+w+"="+q*w+"\t");

            }
            System.out.println("\t");
        }


        int r[][] = new int [10][10];
        for (int t = 1; t <10 ; t++) {
            for (int y = 1; y <=t ; y++) {
                r[t][y] = t*y;
                System.out.print(t+"*"+y+"="+t*y+"\t");
            }
            System.out.println("\t");
        }

    }



}

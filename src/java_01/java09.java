package java_01;

import java.util.Scanner;

/**
 * Created by zhaoyingxiang on 2017/7/16 - 21:45.
 */
public class java09 {
    public static void main(String[] args) {
        int a[] = new int [2];
        System.out.println("请输入"+a.length+"个整数");
        Scanner s =new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] =s.nextInt();
        }
        //计算元素数组的和
        int total = 0;

        for (int i = 0; i < a.length; i++) {
            total += a[i];
        }
        System.out.println("所有元素的和为"+total);

        int b[] = {10,89,65,29,84,39};
        for (int c : b) {
            System.out.println(c);
        }
        int max = 0;
        int min = 0 ;
        max = min =b[0];
        for (int i = 0; i < b.length; i++) {
            if (b[i]>max) {
                max = b[i];
            }
            if (b[i]<min) {
                min = b[i];
            }

        }
        System.out.println("最大值为"+max);
        System.out.println("最小值为"+min);

        //排序
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length-1; j++) {
                if (b[i]>b[j]) {
                   int temp=b[i];
                    b[i]=b[j];
                    b[j]=temp;


                }
            }
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println("排序规则为："+b[i]);
        }
    }
}

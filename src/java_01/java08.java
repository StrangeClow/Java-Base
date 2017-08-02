package java_01;

import java.util.Scanner;

/**
 * Created by zhaoyingxiang on 2017/7/16 - 19:36.
 */
public class java08 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("请输入年份");
        int year = s.nextInt();
        System.out.println("请输入月份");
        int month = s.nextInt();
        int days = 0;
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days=31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days=30;
                break;
            case 2:
                // 判断闰年
                if(year%4==0 && year%100!=0 || year%400==0)
                    days=29;
                else
                    days=28;
                break;
            default:
                System.out.println("月份输入错误！");
                System.exit(0);  // 强制结束程序
        }
        System.out.printf("天数：%d\n", days);
    }
}

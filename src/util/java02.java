package util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * User: zyx
 * Date: 2017/8/16 18:20
 */
public class java02 {
    public static void main(String[] args) {
        Date d = new Date();     //创建时间对象
        System.out.println(d);
        long b = d.getTime();
        System.out.println(b);
        SimpleDateFormat S = new SimpleDateFormat("yyyy 年 MM 月 dd 日 E 北京时间");
        System.out.println(S.format(d));   //北京时间
        SimpleDateFormat SS = new SimpleDateFormat("北京时间：yyyy 年 MM 月 dd 日 HH 时 mm 分 ss 秒");
        System.out.println(SS.format(-1000));

    }
}

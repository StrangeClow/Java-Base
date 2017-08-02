package java_02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by zhaoyingxiang on 2017/7/21 - 8:51.
 */
public class java12 {
    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String str1 = "2003-6-6 9:0:0";
        String str2 = "2003-6-6 10:0:0";
        Date date1 = null;
        try {
            date1 = formatter.parse(str1);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Date date2 = null;
        try {
            date2 = formatter.parse(str2);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        long i = (date2.getTime()-date1.getTime())/(1000*60);

        System.out.println(i);


    }
}

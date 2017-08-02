package java_02;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by zhaoyingxiang on 2017/7/18 - 16:10.
 */
public class java02 {
    public static void main(String[] args) throws ParseException {
//        Date d = new Date();
//        System.out.println(d);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String dateNowStr = sdf.format(new java.util.Date().getTime());
        System.out.println("格式化后的日期：" + dateNowStr);


        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long currentDate = new Date().getTime();
        System.out.println(currentDate);

        DateFormat formart = new SimpleDateFormat("HH:mm");
        Date day= null;
        try {
            day = formart.parse("12:00");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(day.toString());
    }
}

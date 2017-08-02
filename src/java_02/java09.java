package java_02;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by zhaoyingxiang on 2017/7/19 - 10:30.
 */
public class java09 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd HH:mm");
        Long currentDate = new Date().getTime();
        System.out.println(sdf.format(currentDate));
    }
}

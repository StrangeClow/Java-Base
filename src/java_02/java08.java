package java_02;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by zhaoyingxiang on 2017/7/19 - 9:03.
 */
public class java08 {
    public static void main(String[] args) {


    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    long currentDate = new Date().getTime();
       System.out.println("--"+sdf.format(currentDate));
  //  long infoDate = 0L;
  //  String newInfoDeadLine = obj[16].toString();
  //  Date date = obj[17] != null ? (Date)obj[17] : (Date)obj[4];
   // infoDate = date.getTime();
    //        System.out.println(currentDate);
    }
}

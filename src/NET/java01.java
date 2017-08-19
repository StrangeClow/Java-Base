package NET;/*
* @author zhaoyingxiang
* @Date Createed in 2017/8/19 10:45
*    获取某个网站的ip和域名
*/

import java.net.InetAddress;
import java.net.UnknownHostException;

public class java01 {
    public static void main(String[] args) {
        try {   //以下代码通过域名建立intelAdress对象
            InetAddress addr = InetAddress.getByName("www.baidu.com");
            String domainName =  addr.getHostName();  //获取主机名
            String ipname = addr.getHostAddress(); //获取ip
            System.out.println(domainName);
            System.out.println(ipname);
        }
        catch(UnknownHostException e){
            e.printStackTrace();
        }
    }
}

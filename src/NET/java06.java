package NET;
/*
* @author zhaoyingxiang
* @Date Createed in 2017/8/20 16:05 
*/

import java.sql.*;

public class java06 {
    public static void main(String[] args) {
        //声明connection对象
        Connection con;
        //操作语句
        PreparedStatement psql;
        //驱动程序名
        String Driver = "com.mysql.jdbc.Driver";
        //url指向要访问的数据库的名字
        String url ="jdbc:mysql://localhost:3306/world" ;
        //mysql配置时的用户名
        String user = "root";
        //mysql的登录密码
        String pd = "root";
        //遍历查询结果集
        try {
            //加载驱动程序
            Class.forName(Driver);
            //1.getConnection方法连接数据库
            con = DriverManager.getConnection(url,user,pd);
            if (!con.isClosed()) {
                System.out.println("成功连接到数据库");

                //2.创建statement对象 用来执行sql语句
                Statement stat = con.createStatement();
                //要执行的sql
                String sql = "select * from zyx";
                //从建立的world数据库中读取数据表zyx
                //3.ResultSet类，用来存放获取的结果集
                ResultSet rs = stat.executeQuery(sql);
                System.out.println("------------");
                System.out.println("执行结果显示如下");
                System.out.println("-----------");
                System.out.println("年龄"+"\t"+"产品"+"\t"+"产地"+"内容");
                System.out.println("******************");
                Integer age = null;
                String name = null;
                String adress = null;
                String content = null;

                psql = con.prepareStatement("insert into zyx (age,name,adress,content) "
                        + "values(?,?,?,?)");
                psql.setInt(1,26);
                psql.setString(2,"酷派");
                psql.setString(3,"hello苦");
                psql.setString(4,"haohaoxuexi 提那天向上");
                //执行更新
                psql.executeUpdate();



                while(rs.next()) {
                    //获取年龄
                    age = rs.getInt("age");
                    //获取stuname这列数据
                    name = rs.getNString("name");
                    //获取stuid这类数据
                    adress = rs.getNString("adress");
                    //获取内容
                    content = rs.getNString("content");

                    //
                  //  name = new String(name.getBytes("ISO-8859-1"),"gb2312");

                    //输出结果
                    System.out.println(age+"\t"+name+"\t"+adress+"\t"+content);

                }
                rs.close();
                con.close();
            }


        }
        catch(ClassNotFoundException e) {
            //数据库驱动异常处理
            System.out.println("sorry，cnat find the Driver");

            e.printStackTrace();
        }
        catch(SQLException e) {
            //数据库连接失败异常
            e.printStackTrace();
        }
        catch(Exception e) {
            //TODO: Handel exception
            e.printStackTrace();
        }
        finally {
            System.out.println("数据库成功获取");
        }
    }
}

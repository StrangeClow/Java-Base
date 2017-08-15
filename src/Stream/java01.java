package Stream;

import java.io.FileReader;
import java.io.IOException;

/*
* @author zhaoyingxiang
* @description
* @Date Createed in  2017/8/15 19:46
* @modidied by 
*
*/
class java01 {
    public static void main(String[] args) throws IOException{
        char a[] = new char[1000];   //创建一个chae类型的数组
        FileReader b = new FileReader("a.txt");
        int num  =b.read(a);   //将数据读入到数组a中，并返回数组数
        String s =new String (a,0,num);
        System.out.println("读取的字符个数为："+num+"内容为：\n");
        System.out.println(s);
    }
}

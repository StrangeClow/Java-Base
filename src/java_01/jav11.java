package java_01;

import java.util.Arrays;

/**
 * Created by zhaoyingxiang on 2017/7/17 - 21:35.
 */
public class jav11 {
    public static void main(String[] args) {
        String A = "hello world";
        String b = "i dont like this work i want to chang this status";

        System.out.println("A的长度为："+A.length());
        System.out.println("b的长度为："+b.length());

        String c = "l want to program";
        System.out.println("选取字符："+c.charAt(5));

        String d = "are oyu ok?";
        System.out.println("是否包含"+d.contains("k"));

        String e = "do you want to change ?";
        System.out.println("replace后:"+e.replace("do","fuck"));

        String f = "ilikeboydr";
        String g[] = f.split("");
        System.out.println("split之后："+ Arrays.toString(g));

        String str = "wei_xue_yuan_is_good";
        String strArr[] = str.split("_");
        System.out.println(Arrays.toString(strArr));

        StringBuffer sb = new StringBuffer("upset aer you konw?");
        System.out.println(sb.append("instring"));

        StringBuffer s = new StringBuffer("ha loeel");
        System.out.println(s.deleteCharAt(4));

        StringBuffer s1 = new StringBuffer("my name is job");
        System.out.println(s1.insert(4,"aha"));
    }
}

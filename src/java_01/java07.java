package java_01;

/**
 * Created by zhaoyingxiang on 2017/7/16 - 19:23.
 */
public class java07 {
    public static void main(String[] args){
        int i, j;
        for(i=1; i<=9; i++){
            for(j=1; j<=9; j++){
                if(j<i){
                    //打印八个空格，去掉空格就是左上三角形
                    System.out.print("        ");
                }else{
                    System.out.printf("%d*%d=%2d  ", i, j, i*j);
                }
            }
            System.out.print("\n");
        }
    }
}

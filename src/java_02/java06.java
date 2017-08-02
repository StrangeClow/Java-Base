package java_02;

/**
 * Created by zhaoyingxiang on 2017/7/18 - 21:22.
 */
public class java06 {
    public int x = 20;
    public int y = 20;

    public  void sum() {
        int z = this.x + this.y;
        System.out.println("x+y="+z);
    }

    public static void main(String[] args) {
        java06 j = new java06();
        j.sum();
    }
}

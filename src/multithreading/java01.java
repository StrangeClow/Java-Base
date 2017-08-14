package multithreading;

/*
* @author zhaoyingxiang
* @description
* @Date Createed in  2017/8/14 19:57
* @modidied by
*
*controlling the main thread
*/
 class java01 {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("current thread"+ t);
        //change the name of the thread
        t.setName("my Thread");
        System.out.println("After name change :"+ t);
        try {
            for (int n=5; n>0;  n--) {
                System.out.println(n);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e) {
            System.out.println("main thread interrupted");
        }
    }
}

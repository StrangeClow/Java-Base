package multithreading;

/*
* @author zhaoyingxiang
* @description
* @Date Createed in  2017/8/14 20:05
* @modidied by 
*
*/public class extends_Thread extends Thread{
    extends_Thread() {
        //create a new, second thread
        super("Demo Thread");
        System.out.println("Child thread:"+ this);
        start();//start the thread
    }

    //this is the entry point for the second thread
    public void run () {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("child thread"+i);
                Thread.sleep(500);
            }
        }
        catch (InterruptedException e) {
            System.out.println("child interruped");
        }
        System.out.println("Exiting child Thread");
    }
}
class ExtendThread {
    public static void main(String[] args) {
        new extends_Thread();//create a new thread
        try{
            for (int i = 5; i >0 ; i--) {
                System.out.println("Main Thread"+i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e) {
            System.out.println("Mian thread interruped");
        }
        System.out.println("Main thread exting ");
    }
}
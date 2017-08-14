package multithreading;

import sun.rmi.runtime.NewThreadAction;

/*
* @author zhaoyingxiang
* @description
* @Date Createed in  2017/8/14 20:05
* @modidied by
*
*/ class shixain_Runnable implements Runnable{
    Thread t;
    shixain_Runnable() {
        //create  a new ,second thread
        t = new Thread(this,"Demo Thread");
        System.out.println("child Thread"+t);
        t.start();//start the thread
    }


//this is the entry point for the second thread
public void run () {
    try{
        for (int i = 5; i > 0; i--) {
            System.out.println("child Thread"+i);
            Thread.sleep(500);
        }
    }catch (InterruptedException e){
        System.out.println("child interrupted");
    }
    System.out.println("Exting child thread");
}
}
class ThreadDemo {
    public static void main(String[] args) {
        new shixain_Runnable();//create a new thread
        try {
            for (int i = 5; i >0; i--) {
                System.out.println("Main Thread"+i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
                System.out.println("Main thread interrupted");
            }
            System.out.println("Main thread interruped");
        }

}
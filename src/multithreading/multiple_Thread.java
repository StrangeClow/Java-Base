package multithreading;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/*
* @author zhaoyingxiang
* @description
* @Date Createed in  2017/8/14 20:41
* @modidied by 
*
*/
class multiple_Thread implements Runnable{
    String name;
    Thread t;
    multiple_Thread(String Threadname) {
        name = Threadname;
        t = new Thread(this,name);
        System.out.println("new Thread:"+ t);
        t.start();//start the thread
    }

    //tis is the entry point for thread
    public void run (){
        try{
            for (int i = 10; i >0; i--) {
                System.out.println(name+""+i);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e) {
            System.out.println(name+"interrupted");
        }
        System.out.println(name+"exiting");
    }
}
class MultiThreadDemo {
    public static void main(String[] args) {
        new multiple_Thread("one");
        new multiple_Thread("two");
        new multiple_Thread("three");
        try {
            //wait for other threads to end
            Thread.sleep(1000);

    }catch(InterruptedException e) {
        System.out.println("main thread interrrupited");
    }
    System.out.print("Main thread exiting");
}
}
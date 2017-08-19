package applet;

/**
 * User: zyx
 * Date: 2017/8/18 16:37
 */
import java.applet.*;
import java.awt.*;
public class java03 extends Applet{
    int i=1;
    public void init(){
        setBackground(Color.blue);
    }
    public void paint(Graphics g){
        i = i+8; if(i>160)i=1;
        g.setColor(Color.red);g.fillRect(i,10,20,20);
        g.drawString("我正学习update()方法",100,100);
        try{
            Thread.sleep(100);
        }
        catch(InterruptedException e){}
        repaint();
    }
    public void update(Graphics g){
        g.clearRect(i,10,200,100);//不清除"我正在学习update()方法"
        paint(g);
    }
}
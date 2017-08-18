package applet;

/**
 * User: zyx
 * Date: 2017/8/18 16:28
 */
import java.applet.*;
import java.awt.*;
import java.applet.*;
import java.awt.*;
public class java01 extends Applet{
    public void paint(Graphics g){
        setSize(380,200);
        for(int i=0;i<=10;i++){
            Color myredcolor = new Color(i*25+5,0,0);
            g.setColor(myredcolor);
            g.fillRect(i*32+5,2,28,28);
        }
        for(int i=0;i<=10;i++){
            Color mygreencolor = new Color(0,i*25+5,0);
            g.setColor(mygreencolor);
            g.fillRect(i*32+5,32,28,28);
        }
        for(int i=0;i<=10;i++){
            Color mybluecolor = new Color(0,0,i*25+5);
            g.setColor(mybluecolor);
            g.fillRect(i*32+5,62,28,28);
        }
    }
}

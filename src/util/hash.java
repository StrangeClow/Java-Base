package util;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

/**
 * User: zyx
 * Date: 2017/8/16 18:29
 * hashtable的相关应用
 */
public class hash {
    public static void main(String[] args) {
        Hashtable h = new Hashtable();
        h.put("one",new Integer(1));
        h.put("two",new Integer(2));
        h.put("three",new Integer(3));
        Set s = h.keySet();
        for (Iterator<String> i = s.iterator(); i.hasNext();) {
            System.out.println(i.next());
        }
    }
}

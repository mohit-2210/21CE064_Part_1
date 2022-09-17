import java.lang.*;
import java.util.LinkedList;
import java.util.Vector;


public class SampleLinkList {
    public static void main(String[] args) {
        /*LinkedList L = new LinkedList();
        L.add(20);
        L.add("hello");
        L.add(30.54f);
        L.add(null);
        L.add(true);
        L.add(1,30);
        L.remove(3);
        System.out.println(L);

    }*/

    Vector v = new Vector();
    v.add(10);
    v.add("No");
    v.add(null);
    v.add(true);
    
    System.out.println(v);
    System.out.println(v.capacity());
}
}

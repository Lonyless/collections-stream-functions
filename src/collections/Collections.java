
package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;


public class Collections {


    public static void main(String[] args) {
        
        /*Queue<String> fila = new LinkedList<>();
        fila.add("first");
        fila.add("second");
        fila.add("third");
        fila.add("fourth");
        
        Iterator<String> it = fila.iterator();
        
        while(it.hasNext()) {
            System.out.println(it.next());
        }*/
        
        Set<String> hs = new HashSet<>();
        
        hs.add("first");
        hs.add("second");
        hs.add("third");
        hs.add("fourth");
        
        System.out.println(hs);
        
        hs.remove("first");
        System.out.println(hs);
    }
}

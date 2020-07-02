
package generics;

import java.util.ArrayList;
import java.util.List;

public class Objeto<AUX> {
    
    public void printGeneric(AUX e) {
         List<AUX> vetor = new ArrayList<>();
         vetor.add(e);
         System.out.println(e);
    }
}

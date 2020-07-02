
package threads;

import java.util.logging.Level;
import java.util.logging.Logger;

public class thread {
    public static void main(String[] args) {
        threadBar t = new threadBar();
        threadBar t2 = new threadBar();
        t.start();
        t2.start();
        
        threadBar2 tt = new threadBar2();
        threadBar2 tt2 = new threadBar2();
        tt.start();
        tt2.start();
    }
 
}

class threadBar extends Thread {
    @Override
    public void run(){
        super.run();
        System.out.println("t: "+this.getName());
        
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(threadBar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

class threadBar2 extends Thread {
    @Override
    public void run(){
        super.run();
        
        
        try {
            Thread.sleep(5000);
            System.out.println("t2: "+this.getName());
        } catch (InterruptedException ex) {
            Logger.getLogger(threadBar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

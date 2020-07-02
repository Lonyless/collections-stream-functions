package generics;

import java.util.Scanner;
import java.util.function.UnaryOperator;

public class Generics {

    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);
        
        UnaryOperator<Integer>  un = valor -> valor*3;
        System.out.println(un.apply(tec.nextInt()));
        
        /*
        System.out.println("Usando a classe Objeto com um int");
        Objeto<Integer> objInt = new Objeto<>();
        objInt.printGeneric(tec.nextInt());
        
        System.out.println("Usando a classe Objeto com uma String");
        Objeto<String> objString = new Objeto<>();
        objString.printGeneric(tec.next());
            */
    }
    
}

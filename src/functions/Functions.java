package functions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Functions {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        Fun f1 = valor -> System.out.println(valor);;
        
        f1.generate("mil");
        
        //trabalhando strem com arraylist
        List<String> vet = new ArrayList<>();
        vet.add("t1");
        vet.add("t2");
        
        //se usa o metodo stream chamando da lista
        vet.stream()
                .filter(nome -> nome.toString().contains("1"))
                .forEach(System.out::println);
        
        
        //trabalhando stream com vetor normal
        String[] vetor = {"t1", "t2"};
        
        //se usa o abstratrato Stream.of passando como parametro o vetor
        Stream.of(vetor)
                .filter(nome -> nome.contains("t1"))
                .forEach(System.out::println);
        
        
    }
}

interface Fun {

    void generate(String valor);
}

package generics;

import java.util.HashSet;
import java.util.Set;
import javax.print.attribute.HashAttributeSet;

public class GenericsExemploSet {
    public static void main(String[] args) {
        //Exemplo sem generics
        Set conjuntoSemGenerics = new HashSet();
        conjuntoSemGenerics.add("Elemento 1");
        conjuntoSemGenerics.add("10"); //permite adicionar qualquer tipo de objeto

        //Exemplo com Generics
        Set<String> conjuntoGenerics = new HashSet<>();
        conjuntoGenerics.add("Elemento 1");
        conjuntoGenerics.add("Elemento 2");

        //Iterando sobre o conjunto com Generics

        for (String elemento : conjuntoGenerics) {
            System.out.println(elemento);
        }
        
        //iterando sobre o conjunto sem generics (necessário fazer cast)
        for (Object elemento : conjuntoSemGenerics) {
            String str = (String) elemento;
            System.out.println(str);
        }
    }
}

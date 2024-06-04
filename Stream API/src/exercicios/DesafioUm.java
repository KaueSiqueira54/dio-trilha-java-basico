package exercicios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DesafioUm {
    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1,3,5,4,6,9,8,7,0);
        
        List<Integer> numerosOrdemNatural = numeros.stream()
            .sorted(Comparator.naturalOrder())
            .collect(Collectors.toList());

        numerosOrdemNatural.forEach(System.out::println);
    }

}

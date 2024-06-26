package exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class DesafioCinco {
    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;

        List<Integer> maiorCinco = numeros.stream()
        .filter(n -> (n > 5))
        .toList();
        
        int media = maiorCinco.stream()
        .reduce(0, somar);

        System.out.println(maiorCinco);
    }
}

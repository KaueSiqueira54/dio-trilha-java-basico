

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExemplo {
    public static void main(String[] args) {
        //Criando uma lista com números inteiros
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);

        //usar o Costumer com expressoes lambda para imprimir numeros pares

        Consumer<Integer> imprimirNumerosPares = numero -> {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        };
    
    //usar o consumer para imprimir números pares no Strem
    numeros.stream().forEach(t -> {
            if (t % 2 == 0) {
                System.out.println(t);
            }
        };
    }
 }


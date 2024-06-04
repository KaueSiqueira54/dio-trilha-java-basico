
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExemplo {
    public static void main(String[] args) {
        //Criando uma lista com numeros inteiros

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        //Usar functipn com expressão lambda para dobrar todos os números

        Function<Integer, Integer> dobrar = numero -> numero * 2;
        
        //Usar a função para dobrar todos os números no Stream e armazenar em outra lista
        
        List<Integer> numerosDobrados = numeros.stream()
            .map(n -> n * 2)
            .toList();

        //Imprimir a lista de numeros dobrados
        numerosDobrados.forEach(System.out::println);
    }
}

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExample {
    public static void main(String[] args) {
        //Usar Suplier com expressao lambda para fornecer uma saudação personalizada
        Supplier<String> saudacao = () -> "Olá, seja bem Vindo!";
        
        //Usar o Supplier para obter uma lista com 5 saudações
        List<String> listaSaudacoes = Stream.generate(() -> "Ola, seja bem vindo")
        .limit(5)
        .collect(Collectors.toList());

        //imprimir as saudações geradas
        listaSaudacoes.forEach(System.out::println);
    }
}

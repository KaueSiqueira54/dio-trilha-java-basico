package generics;

import java.util.HashMap;
import java.util.Map;

public class GenericsExemploMap {
    public static void main(String[] args) {
        //exemplo sem generics
        Map mapaSemGenerics = new HashMap();
        mapaSemGenerics.put("Chave 1", 10);
        mapaSemGenerics.put("Chave 2", "Valor"); //Permite adicionar qualquer tipo de dado

        //Exemplo com Generics
        Map<String, Integer> mapaGenerics = new HashMap<>();
        mapaGenerics.put("Chave 1", 10);
        mapaGenerics.put("Chave 2", 20);

        //iterando sobre o mapa com generics
        for (Map.Entry<String, Integer> entry : mapaGenerics.entrySet()) {
            String chave = entry.getKey();
            int valor = entry.getValue();
            System.out.println("Chave" + chave + ", valor: " + valor);
        }

        //Iterando sobre o mapa sem generics
        for (Object obj : mapaSemGenerics.entrySet()) {
            Map.Entry entry = (Map.Entry) obj;
            String chave = (String) entry.getKey();
            Object valor = entry.getValue();
            System.out.println("Chave " + chave + ", valor: " + valor);

        }
    }
}

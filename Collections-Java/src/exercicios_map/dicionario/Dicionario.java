package exercicios_map.dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    
    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavras(String palavra, String definicao)  {
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalvra(String palavra) {
        dicionarioMap.remove(palavra);
    }

    public void exibirPalavra() {
        System.out.println(dicionarioMap);
    }

    public String pesquisarPorDefinicao(String palavra) {
        String pesquisarPorNome = null;
        if (!dicionarioMap.isEmpty()) {
            pesquisarPorNome = dicionarioMap.get(palavra);
        }
        return pesquisarPorNome;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavras("Arroz", "Comida");
        dicionario.exibirPalavra();
        //dicionario.removerPalvra("Arroz");
        System.out.println(dicionario.pesquisarPorDefinicao("Arroz"));
        dicionario.removerPalvra("Arroz");
        dicionario.exibirPalavra();
    }
}
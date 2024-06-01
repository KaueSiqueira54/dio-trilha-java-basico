package exercicios_map.contagem_palavras;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    
    private Map<String, Integer> contagemMap;

    public ContagemPalavras() {
        this.contagemMap = new HashMap<>();
    }
    
    public void adicionarPalavras(String palavra, Integer contagem) {
        contagem = 0;
        contagemMap.put(palavra, contagem);
        }

    public void removerPalavras(String palavra) {
        if (!contagemMap.isEmpty()) {
            contagemMap.remove(palavra);
        }
    }

    public void exibirPalavras() {
        System.out.println(contagemMap);
    }
}

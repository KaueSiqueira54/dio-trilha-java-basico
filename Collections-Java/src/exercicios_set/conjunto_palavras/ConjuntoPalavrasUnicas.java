package exercicios_set.conjunto_palavras;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    
    private Set<Palavras> palavras;

    public ConjuntoPalavrasUnicas() {
        this.palavras = new HashSet();
    }
    
    public void adicionarPalavra(String palavra) {
        palavras.add(new Palavras(palavra));
    }

    public void removerPalavra(String palavra) {
        Palavras remoPalavras = null;
        palavras.remove(remoPalavras);
    }

    public void verificarPalavra(String palavra) {
        Palavras verificPalavras = null;
        for (Palavras p : palavras) {
            if (palavras == p) {
                System.out.println("Esta palvra já existe no conjunto");
            }
        }

    }
    public void exibirPalavrasUnicas() {
        System.out.println(palavras);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("UM");
        conjuntoPalavrasUnicas.adicionarPalavra("Um");
        conjuntoPalavrasUnicas.verificarPalavra("UM");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
        conjuntoPalavrasUnicas.removerPalavra("UM");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
    }
}

package exercicios_set.exibir_produtos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    //atributos

    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }
    
    public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(codigo, nome, preco, quantidade));
    }

    public Set<Produto> exibiProdutosPorNome() {
        Set <Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirPorPreco() {
        Set<Produto> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtoPorPreco.addAll(produtoSet);
        return produtoPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(0023, "Arroz", 12, 5);
        cadastroProdutos.adicionarProduto(5642, "Feijão", 8.98, 6);
        cadastroProdutos.adicionarProduto(9864, "Oleo", 9.98, 3);

        System.out.println(cadastroProdutos.exibirPorPreco());
        //System.out.println(cadastroProdutos.exibiProdutosPorNome());

    }
}

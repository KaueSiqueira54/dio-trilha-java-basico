package exercicios_map.pesquisa_produtos;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {
    
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProduto() {
        this.estoqueProdutosMap = new HashMap<>();
    }
    
    public void adicionarProduto(long codigo, String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(codigo, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotal() {
        double valorTotalEstoque = 0d;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro () {
        Produto produtoMaisCaro =null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }
    public static void main(String[] args) {
        EstoqueProduto estoqueProduto = new EstoqueProduto();

        estoqueProduto.adicionarProduto(8978, "Arroz", 5, 8.99);
        estoqueProduto.adicionarProduto(8976, "Feijão", 7, 5.98);
        estoqueProduto.adicionarProduto(6589, "Oleo", 6, 7.98);

        estoqueProduto.exibirProdutos();

        System.out.println("Valor total do estoque: " + estoqueProduto.calcularValorTotal());
    }
}

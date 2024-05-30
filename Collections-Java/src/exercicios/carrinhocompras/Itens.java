package exercicios.carrinhocompras;

public class Itens {
    private String nome;
    private double preco;
    private int quantidade;

    @Override
    public String toString() {
        return "Itens [nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
    }
    
    public Itens(String none, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public int getquantidade() {
        return quantidade;
    }

}

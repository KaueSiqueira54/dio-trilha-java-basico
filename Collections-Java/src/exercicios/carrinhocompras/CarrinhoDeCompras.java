package exercicios.carrinhocompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Itens> listaCompras;

    public CarrinhoDeCompras() {
        this.listaCompras = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        Itens itens = new Itens(nome, preco, quantidade);
        this.listaCompras.add(itens);
    }
    public void removerItem(String nome) {
      List<Itens> itensRemover = new ArrayList<>();
        if(!listaCompras.isEmpty()) {
            for (Itens i : listaCompras) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itensRemover.add(i);
                }
            }listaCompras.removeAll(listaCompras);
        }else {
            System.out.println("A lista se encontra vazia!");
        }
    }
    public double calcularValortotal() {
        double valorTotal = 0d;
        if (!listaCompras.isEmpty()) {
            for (Itens itens : listaCompras) {
                double valorItem = itens.getPreco() * itens.getquantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        }else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public void exibirItens() {
        if (!listaCompras.isEmpty()) {
            System.out.println(this.listaCompras);
        }else {
            System.out.println("A lista está vazia");
        }
    }

    @Override
    public String toString() {
        return "listaCompras=" + listaCompras + "";
    }
    
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras= new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Caneta", 5d, 3);
        carrinhoDeCompras.adicionarItem("Lápis", 3d, 5);

        carrinhoDeCompras.exibirItens();

    }
}
    


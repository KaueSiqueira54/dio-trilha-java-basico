package exercicios.pesquisalist;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //atributo

    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList();
    }
    
    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if(l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarIntervaloAnos(int anoInicial, int anoFinal) {
        List <Livro> livrosPorIntervaloAnos = new ArrayList();
        if (!livroList.isEmpty()) {
            for (Livro l :livroList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()) {
            for(Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }
    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Livro 1", "autor 1", 2000);
        catalogoLivros.adicionarLivro("Livro 2", "autor 2", 2001);
        catalogoLivros.adicionarLivro("Livro 3", "autor3", 2002);

        System.out.println(catalogoLivros.pesquisarPorAutor("autor 1"));
        System.out.println(catalogoLivros.pesquisarIntervaloAnos(2000, 2003));
        System.out.println(catalogoLivros.pesquisarPorTitulo("livro 1"));
    }
}

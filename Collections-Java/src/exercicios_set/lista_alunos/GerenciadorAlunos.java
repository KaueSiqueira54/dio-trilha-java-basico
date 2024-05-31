package exercicios_set.lista_alunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    private Set<Alunos> alunosSet;

    public GerenciadorAlunos() {
        this.alunosSet = new HashSet<>();
    }
    
    public void adicionarAluno (String nome, long matricula, double media) {
        alunosSet.add(new Alunos(nome, 0, media));
    }

    public void removerAluno(long matricula) {
        alunosSet.remove(alunosSet);
    }

    public Set<Alunos> exibirPorNome() {
        Set<Alunos> exibirNome = new TreeSet<>(alunosSet);
        return exibirNome;
    }

    public Set<Alunos> exibirPorNota() {
        Set<Alunos> exibirNota = new TreeSet<>(new ComparatorPorNota());
        alunosSet.addAll(exibirNota);
        return exibirNota;
    }
    public void exiibirAlunos() {
        System.out.println(alunosSet);
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("Mateus", 255, 7);
        gerenciadorAlunos.adicionarAluno("Armando", 256, 8);
        gerenciadorAlunos.exiibirAlunos();
        System.out.println(gerenciadorAlunos.exibirPorNome());
        System.out.println(gerenciadorAlunos.exibirPorNota());

    }
}

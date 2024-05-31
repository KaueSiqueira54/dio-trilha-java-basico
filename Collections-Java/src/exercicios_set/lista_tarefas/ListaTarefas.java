package exercicios_set.lista_tarefas;

import java.util.HashSet;
import java.util.Set;

import exercicios.operacoesbasicas.listatarefas.Tarefa;
import jdk.jshell.execution.FailOverExecutionControlProvider;

public class ListaTarefas {

    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }
    
    public void adicionarTarefa(String descricao) {
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        tarefaSet.remove(descricao);
    }

    public void ContarTarefa() {
        tarefaSet.size();
    }

    public void exibirTarefas() {
        System.out.println(tarefaSet);
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasconcluidas = new HashSet<>();
        for (Tarefa f : tarefaSet) {
            if (f.getDescricao().startsWith("TC")) {
                tarefasconcluidas.add(f);
            }
        }
        return tarefasconcluidas;
    }
    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa f : tarefaSet) {
            if (f.getDescricao().startsWith("TP")) {
                tarefasPendentes.add(f);
            }
        }
        return tarefasPendentes;
    }

    public Set<Tarefa> marcartarefaConcuida(String descString) {
        Set <Tarefa> marcarTarefaConcluida = new HashSet<>();
        for (Tarefa f : tarefaSet) {
            if (f.getDescricao().startsWith("TC")) {
                marcarTarefaConcluida.add(f);
            }
        }
        return marcarTarefaConcluida;
    }

    public Set<Tarefa> marcartarefaPendente(String descricao) {
        Set<Tarefa> marcarTarefaPendente = new HashSet<>();
        for (Tarefa f : tarefaSet) {
            if (f.getDescricao().startsWith("TP")) {
                marcarTarefaPendente.add(f);
            }
        }
        return marcarTarefaPendente;
    }

    public void limparListaTarefas()  {
        tarefaSet.removeAll(tarefaSet);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("TP 1");
        listaTarefas.adicionarTarefa("TC 2");
        listaTarefas.exibirTarefas();
        System.out.println(listaTarefas.obterTarefasPendentes());
        System.out.println(listaTarefas.obterTarefasConcluidas());
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
    }   
}

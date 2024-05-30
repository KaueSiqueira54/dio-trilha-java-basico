package exercicios.operacoesbasicas.listatarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> tarefaList;

    //criando construtor
    public ListaTarefas() {
        this.tarefaList = new ArrayList();

    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasRemover = new ArrayList();
        for(Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasRemover);
    }

    public int obterNumerototalTarefas() {
        return tarefaList.size();
    }

    public void obterdescricaoTarefas() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefas listatarefas = new ListaTarefas();

        System.out.println("O número total de elementos da lista é: " + listatarefas.obterNumerototalTarefas());

        listatarefas.adicionarTarefa("Tarefa 1");

        System.out.println("O número total de elementos da lista é: " + listatarefas.obterNumerototalTarefas());
        
        //listatarefas.removerTarefa("Tarefa 1");

        System.out.println(listatarefas.obterNumerototalTarefas());

        listatarefas.obterdescricaoTarefas();

    }
}

package exercicios_set.agenda_contatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //Atributos

    private Set<Contato> contatoSet;
    //construtor

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }
    
    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if (c.getNome().startsWith("maria")) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarnumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c :contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Kaue", 1);
        //ignora, poi
        agendaContatos.adicionarContato("Kaue", 2);
        agendaContatos.adicionarContato("maria", 2);

        agendaContatos.exibirContato();
        System.out.println(agendaContatos.pesquisarPorNome("maria"));

        System.out.println(agendaContatos.atualizarnumeroContato("Kaue", 354));
        agendaContatos.exibirContato();
    }
}

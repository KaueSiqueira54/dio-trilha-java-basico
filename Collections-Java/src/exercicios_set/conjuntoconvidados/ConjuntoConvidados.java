package exercicios_set.conjuntoconvidados;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConjuntoConvidados {
    //atributos
    private Set<Convidado> convidadosSet;

    //construtor
    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidadoSet(String nome, int codigoConvite) {
        convidadosSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadosPorCodigo(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadosSet) {
            if (c.getCodConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadosSet.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return convidadosSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadosSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        //adicionando
        conjuntoConvidados.adicionarConvidadoSet("Convidado 1", 12534);
        conjuntoConvidados.adicionarConvidadoSet("Convidado 2", 12354);
        conjuntoConvidados.adicionarConvidadoSet("Candidato 3", 12324);
        conjuntoConvidados.adicionarConvidadoSet("Candidaro 3", 15543);
        //removendo
        conjuntoConvidados.removerConvidadosPorCodigo(12534);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do set de candidatos");

    }
}

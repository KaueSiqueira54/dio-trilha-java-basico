import java.util.List;

public class Banco {
    
    private List<Conta> contas;

    public List<Conta> getContas() {
        return contas;
    }

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }


}
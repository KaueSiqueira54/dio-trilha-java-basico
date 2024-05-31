package exercicios_set.conjuntoconvidados;

public class Convidado {
    //atributos

    private String nome;

    private int codConvite;

    public Convidado(String nome, int codConvite) {
        this.nome = nome;
        this.codConvite = codConvite;
    }

    public String getNome() {
        return nome;
    }

    public int getCodConvite() {
        return codConvite;
    }
    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codConvite;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Convidado other = (Convidado) obj;
        if (codConvite != other.codConvite)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Convidado [nome=" + nome + ", codConvite=" + codConvite + "]";
    }

    
}

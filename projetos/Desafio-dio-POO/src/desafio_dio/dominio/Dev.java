package desafio_dio.dominio;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String nome;
    private Set<Conteudo> conteudosIscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp) {
         this.conteudosIscritos.addAll(bootcamp.getConteudos());
         bootcamp.getDevsInscritos().add(this);
    }
    public void progresso() {
        Optional<Conteudo> conteudo = this.conteudosIscritos.stream().findFirst();
        if (conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosIscritos.remove(conteudo.get());
        } else {
            System.err.println("Você não está inscrito em nenhum conteúdo");
        }
    }
    public double calcularTotalXp() {
        return this.conteudosConcluidos.stream()
            .mapToDouble(Conteudo::calcularXP)
            .sum();
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Set<Conteudo> getConteudosIscritos() {
        return conteudosIscritos;
    }
    public void setConteudosIscritos(Set<Conteudo> conteudosIscritos) {
        this.conteudosIscritos = conteudosIscritos;
    }
    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }
    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((conteudosIscritos == null) ? 0 : conteudosIscritos.hashCode());
        result = prime * result + ((conteudosConcluidos == null) ? 0 : conteudosConcluidos.hashCode());
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
        Dev other = (Dev) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (conteudosIscritos == null) {
            if (other.conteudosIscritos != null)
                return false;
        } else if (!conteudosIscritos.equals(other.conteudosIscritos))
            return false;
        if (conteudosConcluidos == null) {
            if (other.conteudosConcluidos != null)
                return false;
        } else if (!conteudosConcluidos.equals(other.conteudosConcluidos))
            return false;
        return true;
    }

    
}

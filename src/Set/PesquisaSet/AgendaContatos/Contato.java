package Set.PesquisaSet.AgendaContatos;

import java.util.Objects;

public class Contato {

    //Atributos
    private String nome;
    private long numeroTelefone;

    //Construtor
    public Contato(String nome, long numeroTelefone) {
        this.nome = nome;
        this.numeroTelefone = numeroTelefone;
    }
    //Metodo Get
    public String getNome() {
        return nome;
    }

    //Metodo Get
    public long getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(long numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return Objects.equals(getNome(), contato.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getNome());
    }

    //Metodo toString
    @Override
    public String toString() {
        return "{" + nome + '\'' + numeroTelefone +
                '}';
    }
}

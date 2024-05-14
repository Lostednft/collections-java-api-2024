package Set.OperacoesBasicasSet.ConjuntoConvidados;

import java.util.Objects;

public class Convidado {

    private String nome;
    private long codConvite;

    public Convidado(String nome, long codConvite) {
        this.nome = nome;
        this.codConvite = codConvite;
    }

    public String getNome() {
        return nome;
    }

    public long getCodConvite() {
        return codConvite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Convidado convidado = (Convidado) o;
        return getCodConvite() == convidado.getCodConvite();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getCodConvite());
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", codConvite=" + codConvite +
                '}';
    }
}

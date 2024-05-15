package Set.OrdenacaoSet.ListaAlunos;

import java.util.Comparator;

public class Aluno implements Comparable<Aluno>{

    //Atributos
    private String nome;
    private long matricula;
    private double media;

    //Construtor
    public Aluno(String nome, Long matricula, double media) {
        this.nome = nome;
        this.matricula = matricula;
        this.media = media;
    }

    //Metodo da biblioteca Comparable para comparar os nomes e ordenar por Ordem Alfabética
    @Override
    public int compareTo(Aluno a) {
        return nome.compareToIgnoreCase(a.getNome());
    }

    //Metodo Get do Nome
    public String getNome() {
        return nome;
    }

    //Metodo Get da Matrícula
    public long getMatricula() {
        return matricula;
    }

    //Metodo Get da Media
    public double getMedia() {
        return media;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", media=" + media +
                '}';
    }
}

//Classe criara para Listar em Ordem da Media
class ComparacaoPorNota implements Comparator<Aluno>
{

    //Metodo da biblioteca Comparator pra ordenar a media
    @Override
    public int compare(Aluno a1, Aluno a2) {
        return Double.compare(a1.getMedia(), a2.getMedia());
    }
}

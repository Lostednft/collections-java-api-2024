package Set.OrdenacaoSet.ListaAlunos;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    //Atribute
    private Set<Aluno> gerenciadorSet;

    //Contrutor
    public GerenciadorAlunos()
    {
        this.gerenciadorSet = new HashSet<>();
    }

    //Metodo para adicionar aluno na lista
    public void adicionarAluno(String nome, long matricula, double media)
    {
        gerenciadorSet.add(new Aluno(nome, matricula, media));
    }

    //Metodo para remover Aluno da Lista
    public void removerAluno(long matricula)
    {
        if(!gerenciadorSet.isEmpty())
        for (Aluno a : gerenciadorSet) {
            {
                if (a.getMatricula() == matricula) {
                    gerenciadorSet.remove(a);
                    break;
                }
            }
        }
        else
        {
            System.out.println("A Lista Esta Vazia!");
        }
    }

    //Metodo para exibir a Lista por Nome do Aluno
    public Set<Aluno> exibirAlunosPorNome()
    {
        Set<Aluno> alunoPorNome = new TreeSet<>(gerenciadorSet);
        return alunoPorNome;
    }

    //Metodo para exibir a Lista por Nota do Aluno
    public Set<Aluno> exibirAlunosPorNota()
    {
        Set<Aluno> alunoPorNota = new TreeSet<>(new ComparacaoPorNota());
        alunoPorNota.addAll(gerenciadorSet);
        return alunoPorNota;
    }

    //Função para exibir a Lista dos Alunos que foram adicionados
    public void exibirAlunos()
    {
        System.out.println(gerenciadorSet);
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("Luis", 2596454157L, 7.6);
        gerenciadorAlunos.adicionarAluno("Amanda", 6918533196L, 6.1);
        gerenciadorAlunos.adicionarAluno("Julia", 19568681911L, 9.6);
        gerenciadorAlunos.adicionarAluno("Pedro", 98134871947L, 4.5);

        System.out.println("Ordem Natural: ");
        gerenciadorAlunos.exibirAlunos();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" +
                "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" +
                "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Ordenado por Nome:");
        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" +
                "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" +
                "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        gerenciadorAlunos.removerAluno(98134871947L);
        System.out.println("Ordenado por Nota:");
        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());


    }

}

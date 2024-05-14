package Set.PesquisaSet.ListaTarefas;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    //Atributos
    private Set<Tarefa> tarefaSet;

    //Construtor
    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    //Metodo para criar uma nova Tarefa
    public void adicionarTarefa(String descricao)
    {
        tarefaSet.add(new Tarefa(descricao, false));
    }

    //Metodo para remover uma Tarefa
    public void removerTarefa(String descricao)
    {
        Tarefa tarefaRemove = null;

        if(!tarefaSet.isEmpty())
        {
            for (Tarefa t : tarefaSet)
            {
                if (t.getDescricao().equalsIgnoreCase(descricao)) ;
                {
                    tarefaRemove = t;
                    break;
                }
            }
            tarefaSet.remove(tarefaRemove);
        }
        else
        {
            System.out.println("Tarefa Não Encontrada!");
        }

        if(tarefaRemove == null) {
            System.out.println("Tarefa não encontrada!");
        }

    }

    public void exibirTarefas()
    {
        System.out.println(tarefaSet);
    }

    public void contarTarefas()
    {
        System.out.println(tarefaSet.size());
    }


    public Set<Tarefa> obterTarefasConcluidas()
    {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        if(!tarefaSet.isEmpty())
        {
            System.out.println("Tarefas Concluidas: ");
            for (Tarefa t : tarefaSet)
            {
                if (t.isTarefaConcluida() == true)
                {
                    tarefasConcluidas.add(t);
                }
            }
        }
        else
        {
            System.out.println("Tarefa Não Encontrada!");
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes()
    {
        Set<Tarefa> tarefasPendentes = new HashSet<>();

        if(!tarefaSet.isEmpty())
        {
            System.out.println("Tarefas Pendentes: ");
            for (Tarefa t : tarefaSet)
            {
                if (t.isTarefaConcluida() == false)
                {
                    tarefasPendentes.add(t);
                }
            }
        }
        else
        {
            System.out.println("Tarefa Não Encontrada!");
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao)
    {
        if(!tarefaSet.isEmpty())
        {
            for (Tarefa t : tarefaSet)
            {
                if (t.getDescricao().equalsIgnoreCase(descricao) && t.isTarefaConcluida() == false)
                {
                    t.setTarefaConcluida(true);
                    break;
                }
            }
        }
        else
        {
            System.out.println("Tarefa Não Encontrada!");
        }
    }

    public void marcarTarefaPendente(String descricao)
    {
        Tarefa tarefaPendente = null;

        if(!tarefaSet.isEmpty())
        {
            for (Tarefa t : tarefaSet)
            {
                if (t.getDescricao().equalsIgnoreCase(descricao) && t.isTarefaConcluida() == true)
                {
                    tarefaPendente = t;
                    break;
                }
            }

            if (tarefaPendente != null) {

                tarefaPendente.setTarefaConcluida(false);

            }
            else {
                System.out.println("Tarefa não encontrada na lista.");
            }
        }
        else
        {
            System.out.println("A Lista de Tarefa Esta Vazia!");
        }
    }

    public void limparListaTarefas()
    {
        if(tarefaSet.isEmpty())
        {
            System.out.println("A Lista ja ta Vazia!");
        }
        else
        {
            tarefaSet.removeAll(tarefaSet);
        }
    }


    public static void main(String[] args) {

        ListaTarefas listaTarefas = new ListaTarefas();


        listaTarefas.adicionarTarefa("Fazer Compras");
        listaTarefas.adicionarTarefa("Arrumar Quarto");
        listaTarefas.adicionarTarefa("Pagar Contas");
        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Estudar CS50");
        listaTarefas.adicionarTarefa("ir para Faculdade");
        listaTarefas.marcarTarefaConcluida("Pagar Contas");
        listaTarefas.exibirTarefas();

        listaTarefas.marcarTarefaConcluida("Estudar CS50");
        listaTarefas.marcarTarefaPendente("Pagar Contas");
        listaTarefas.exibirTarefas();
        System.out.println(listaTarefas.obterTarefasPendentes());
        System.out.println(listaTarefas.obterTarefasConcluidas());


        System.out.println("-------------------- lista limpada ---------------------------");
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
        listaTarefas.adicionarTarefa("Ler Livro");
        listaTarefas.adicionarTarefa("Pagar Banco");
        listaTarefas.adicionarTarefa("Almoçar");
        listaTarefas.adicionarTarefa("Termina Exercicio");
        listaTarefas.marcarTarefaConcluida("Termina Exercicio");
        System.out.println(listaTarefas.obterTarefasPendentes());
        System.out.println(listaTarefas.obterTarefasConcluidas());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~ tabela ~~~~~~~~~~~~~~~~~~~~~~~");
        listaTarefas.exibirTarefas();
    }
}

package OperaçõesBasicasComList.ListaTafera;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void AdicionarTarefa(String descricao)
    {
        tarefaList.add(new Tarefa(descricao));
    }

    public void RemoverTarefa(String descricao)
    {
        List<Tarefa> listaRemover = new ArrayList<>();

        for (Tarefa t: tarefaList)
        {
            if (t.getDescricao().equals(descricao)){
                listaRemover.add(t);
            }
        }
        tarefaList.removeAll(listaRemover);
    }

    public int ContadorLista()
    {
        return tarefaList.size();
    }

    public void obterDescricoesTarefas()
    {
        System.out.println(tarefaList);
    }
}

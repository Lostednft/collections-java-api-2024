package List.OperaçõesBasicasComList.ListaTafera;

public class Main {
    public static void main(String[] args) {

        ListaTarefa listaTarefa = new ListaTarefa();

        listaTarefa.AdicionarTarefa("List.OperaçõesBasicasComList.ListaDeTafera.Tarefa 1");
        listaTarefa.AdicionarTarefa("List.OperaçõesBasicasComList.ListaDeTafera.Tarefa 2");
        listaTarefa.AdicionarTarefa("List.OperaçõesBasicasComList.ListaDeTafera.Tarefa 3");
        listaTarefa.AdicionarTarefa("List.OperaçõesBasicasComList.ListaDeTafera.Tarefa 3");
        System.out.println("Total de Tarefas: " + listaTarefa.ContadorLista());

        listaTarefa.RemoverTarefa("List.OperaçõesBasicasComList.ListaDeTafera.Tarefa 3");
        System.out.println("Total de Tarefas: " + listaTarefa.ContadorLista());

        listaTarefa.obterDescricoesTarefas();
    }
}
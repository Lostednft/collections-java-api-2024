package Map.OperacoesBasicasMap.AgendaContato;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone)
    {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome)
    {
        agendaContatoMap.remove(nome);
    }

    public void exibirContatos()
    {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome)
    {
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty())
        {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {

        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Felipe", 24515);
        agendaContatos.adicionarContato("Paula", 95310);
        agendaContatos.adicionarContato("Paola", 93581);
        agendaContatos.adicionarContato("João", 15215);
        agendaContatos.adicionarContato("João", 91348);
        agendaContatos.adicionarContato("João", 81237);

        agendaContatos.exibirContatos();
        System.out.println("Numero: " + agendaContatos.pesquisarPorNome("João"));
        agendaContatos.removerContato("Paula");

        agendaContatos.exibirContatos();
    }
}

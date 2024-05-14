package Set.PesquisaSet.AgendaContatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    //Atributo Set Contato.
    Set<Contato> contatoSet;

    //Construtor do HashSet.
    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    //Metodo de Adicionar um Contato no HashSet.
    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    //Metodo de Exibir os Contatos no HashSet.
    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    //Metodo para pesquisar por nome no HashSet.
    public Contato pesquisarPorNome(String nome) {
        Contato contatoPorNome = null;
        if (!contatoSet.isEmpty()) {
            for (Contato c : contatoSet) {
                if (c.getNome().startsWith(nome))
                {
                    contatoPorNome = c;
                    break;
                }
            }
        }
        return contatoPorNome;
    }

    //Metodo para Atualizar o numero de contato do HashSet.
    public Contato atualizarNumeroContato(String nome, int novoNumero)
    {
        Contato contatoAtualizado = null;

        for (Contato c : contatoSet)
        {
            if(c.getNome().equalsIgnoreCase(nome))
            {
                c.setNumeroTelefone(novoNumero);
                contatoAtualizado = c;

            }
        }
        return contatoAtualizado;
    }

    //Metodo Main.
    public static void main(String[] args) {

        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Felipe", 251124);
        agendaContatos.adicionarContato("Julia", 631682);
        agendaContatos.adicionarContato("Maria", 629781);
        agendaContatos.adicionarContato("Marcos", 192623);
        agendaContatos.adicionarContato("Marcos", 191523);

        agendaContatos.exibirContatos();

        System.out.println("Pesquisa de Contato: " + agendaContatos.pesquisarPorNome("Marcos"));

        System.out.println("Contato Atualizado: " + agendaContatos.atualizarNumeroContato("Felipe", 123456));

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        agendaContatos.exibirContatos();
    }
}
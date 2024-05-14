package Set.OperacoesBasicasSet.ConjuntoConvidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, long codConvite)
    {
        convidadoSet.add(new Convidado(nome, codConvite));
    }

    public void removerConvidadoPorCodigoConvite(long codigoConv){

        Convidado convidadoSetRemove = null;

        for (Convidado i : convidadoSet)
        {
            if (i.getCodConvite() == codigoConv)
            {
                convidadoSetRemove = i;
                break;
            }
        }
        convidadoSet.remove(convidadoSetRemove);
    }

    public int contarConvidados()
    {
        return convidadoSet.size();
    }

    public void exibirConvidados()
    {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {

        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidado("Luis", 251);
        conjuntoConvidados.adicionarConvidado("Maria", 126);
        conjuntoConvidados.adicionarConvidado("Renata", 96);
        conjuntoConvidados.adicionarConvidado("Lucas", 96);

        conjuntoConvidados.exibirConvidados();

        conjuntoConvidados.removerConvidadoPorCodigoConvite(251);
        System.out.println("Total de Convidados: " + conjuntoConvidados.contarConvidados());
        conjuntoConvidados.exibirConvidados();


    }

}

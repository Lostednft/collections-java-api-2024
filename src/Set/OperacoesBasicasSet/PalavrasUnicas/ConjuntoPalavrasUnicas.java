package Set.OperacoesBasicasSet.PalavrasUnicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> unicaPalavra;

    public ConjuntoPalavrasUnicas() {
        this.unicaPalavra = new HashSet<>();
    }

    public void adicionarPalavra(String palavra)
    {
        unicaPalavra.add(palavra);
    }

    public void removerPalavra(String palavra)
    {
        if (!unicaPalavra.isEmpty())
        {
            if(unicaPalavra.contains(palavra))
            {
                unicaPalavra.remove(palavra);
            }
            else
            {
                System.out.println("Palavra não encontrada no conjunto!");
            }
        }
    }

    public boolean verificarPalavra(String palavra)
    {
        if (!unicaPalavra.isEmpty())
        {
            if (unicaPalavra.contains(palavra))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            System.out.println("O Set esta Vazio!");
            return false;
        }
    }

    public void exibirPalavrasUnicas()
    {
        System.out.println(unicaPalavra);
    }
    public static void main(String[] args) {

        ConjuntoPalavrasUnicas conjPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjPalavrasUnicas.adicionarPalavra("Cachorro");
        conjPalavrasUnicas.adicionarPalavra("Gato");
        conjPalavrasUnicas.adicionarPalavra("Leão");
        conjPalavrasUnicas.adicionarPalavra("Elefante");
        conjPalavrasUnicas.adicionarPalavra("Girafa");

        conjPalavrasUnicas.exibirPalavrasUnicas();

        conjPalavrasUnicas.removerPalavra("Elefante");
        conjPalavrasUnicas.exibirPalavrasUnicas();

        System.out.println("Cachorro esta na lista? " + conjPalavrasUnicas.verificarPalavra("Gato"));
    }
}

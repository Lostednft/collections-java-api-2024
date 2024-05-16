package Map.OperacoesBasicasMap.Dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    //Atributos
    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao)
    {
        dicionarioMap.put(palavra,definicao);
    }

    public String removerPalavra(String palavra)
    {
        String palavraRemovida = dicionarioMap.remove(palavra);
        if (!dicionarioMap.isEmpty())
        {
            if (palavraRemovida != null)
            {
                return palavraRemovida;
            }
            else
            {
                System.out.println("Essa Palavra não foi Encontrada no Dicionário.");
            }
        }
        else
        {
            System.out.println("O Dicionário esta Vazio!");
        }
        return palavraRemovida;
    }

    public void exibirPalavras()
    {
        if (!dicionarioMap.isEmpty())
        {
            System.out.println(dicionarioMap);
        }
        else
        {
            System.out.println("O Dicionário esta Vazio!");
        }
    }

    public String pesquisarPorPalavra(String palavra)
    {
        String palavraPesquisar = null;

        if(!dicionarioMap.isEmpty())
        {
            if (dicionarioMap.containsKey(palavra))
            {
                palavraPesquisar = dicionarioMap.get(palavra);
            }
            else
            {
                palavraPesquisar = "Essa Pessoa Pessoa não Esta no Dicionário!";
            }
        }
        else
        {
            palavraPesquisar ="O Dicionário esta Vazio!";
        }

        return palavraPesquisar;
    }

    public static void main(String[] args) {

        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Felipe", "Estudando TI");
        dicionario.adicionarPalavra("Julia", "Estudando Direito");
        dicionario.adicionarPalavra("Larissa", "Estudando Medicina");
        dicionario.adicionarPalavra("Lucas", "Estudando Nutrição");
        dicionario.adicionarPalavra("Larissa", "Estudando Economia");

        dicionario.removerPalavra("Larissa");
        dicionario.exibirPalavras();

        System.out.println(dicionario.pesquisarPorPalavra("Julia"));


    }
}

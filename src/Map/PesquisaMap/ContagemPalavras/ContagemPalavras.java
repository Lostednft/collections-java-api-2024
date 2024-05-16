package Map.PesquisaMap.ContagemPalavras;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    Map<String, Integer> contandoPalavra;

    public ContagemPalavras() {
        this.contandoPalavra = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem)
    {
        contandoPalavra.put(palavra, contagem);
    }
    public void removerPalavra(String palavra)
    {
        if (!contandoPalavra.isEmpty())
        {
            contandoPalavra.remove(palavra);
        }
        else
        {
            System.out.println("O Map esta vazio!");
        }

    }

    public void exibirContagemPalavras()
    {
        Integer contagem = null;

        if (!contandoPalavra.isEmpty())
        {
            System.out.println(contandoPalavra);
        }
        else
        {
            System.out.println("O Map esta vazio!");
        }
    }

    public String encontrarPalavraMaisFrequente()
    {
        String palavraFrequente = null;
        int maiorContagem = 0;

        if (!contandoPalavra.isEmpty())
        {
            for (Map.Entry<String, Integer> entry : contandoPalavra.entrySet()) {
                if (entry.getValue() > maiorContagem) {
                    maiorContagem = entry.getValue();
                    palavraFrequente = entry.getKey();
                }
            }
        }
        else
        {
            System.out.println("O Map esta vazio!");
        }
        return palavraFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();

        contagemPalavras.adicionarPalavra("Java", 2);
        contagemPalavras.adicionarPalavra("Python", 8);
        contagemPalavras.adicionarPalavra("JavaScript", 1);
        contagemPalavras.adicionarPalavra("C#", 6);
        contagemPalavras.removerPalavra("Python");

        contagemPalavras.exibirContagemPalavras();

        System.out.println("Palavra Mais Frequente: " + contagemPalavras.encontrarPalavraMaisFrequente());
    }

}

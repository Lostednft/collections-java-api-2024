package Map.OdenacaoMapa.LivrariaOnline;

import java.util.*;

public class LivrariaOnline {

    private Map<String, Livro> livroMap;

    public LivrariaOnline() {
        this.livroMap = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco)
    {
        livroMap.put(link, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo)
    {
        if (!livroMap.isEmpty())
        {
            for (var l : livroMap.entrySet())
            {
                if (l.getValue().getTitulo().equalsIgnoreCase(titulo))
                {
                    livroMap.remove(l.getKey());
                }
            }
        }
    }

    public void exibirLivrosOrdenadosPorPreco()
    {
        if (!livroMap.isEmpty())
        {
            List<Map.Entry<String, Livro>> livroParaOrdernarPreco = new ArrayList<>(livroMap.entrySet());

            Collections.sort(livroParaOrdernarPreco, new CompararPorPreco());

            Map<String,Livro> livroOrdenados = new LinkedHashMap<>();

            for (Map.Entry<String, Livro> l : livroParaOrdernarPreco)
            {
                livroOrdenados.put(l.getKey(), l.getValue());
            }

            System.out.println(livroOrdenados);

        }
        else {
            System.out.println("O Map esta Vazio!");
        }
    }

    public Map<String, Livro> pesquisarLivrosPorAutor(String autor)
    {
        Map<String, Livro> livroPorAutor = new HashMap<>();

        if(!livroMap.isEmpty())
        {
            for(Map.Entry<String,Livro> l : livroMap.entrySet())
            {
                if (l.getValue().getAutor().equalsIgnoreCase(autor))
                {
                    livroPorAutor.put(l.getKey(), l.getValue());
                }
            }
        }
        else
        {
            System.out.println("O Map esta Vazio!");
        }
        return livroPorAutor;
    }

    public Map<String, Livro> obterLivroMaisCaro(){

        Map<String, Livro> livroMaisCaro = new HashMap<>();
        double maiorValor = Double.MIN_VALUE;

        if(!livroMap.isEmpty())
        {
            for (Map.Entry<String,Livro> l : livroMap.entrySet())
            {
                if(l.getValue().getPreco() > maiorValor)
                {
                    livroMaisCaro.clear();
                    maiorValor = l.getValue().getPreco();
                    livroMaisCaro.put(l.getKey(), l.getValue());
                }
            }
        }
        else
        {
            System.out.println("O Map esta Vazio!");
        }

        return livroMaisCaro;
    }

    public Map<String, Livro> exibirLivroMaisBarato()
    {
        Map<String, Livro> livroMaisBarato = new HashMap<>();
        double menorValor = Double.MAX_VALUE;

        if(!livroMap.isEmpty())
        {
            for (Map.Entry<String,Livro> l : livroMap.entrySet())
            {
                if(l.getValue().getPreco() < menorValor)
                {
                    livroMaisBarato.clear();
                    menorValor = l.getValue().getPreco();
                    livroMaisBarato.put(l.getKey(), l.getValue());
                }
            }
        }
        else
        {
            System.out.println("O Map esta Vazio!");
        }
        return livroMaisBarato;
    }

    public static void main(String[] args) {

        LivrariaOnline livrariaOnline = new LivrariaOnline();

        livrariaOnline.adicionarLivro("amazon.com/1234511", "Entendendo Algoritmo", "Juliana", 75.50);
        livrariaOnline.adicionarLivro("amazon.com/9335113", "Codigo Limpo", "Pedro", 95.99);
        livrariaOnline.adicionarLivro("amazon.com/3459158", "Arquitetura Limpa", "Pedro", 79.50);
        livrariaOnline.adicionarLivro("amazon.com/9123458", "Fire and Walter", "Bruna", 65.90);
        livrariaOnline.adicionarLivro("amazon.com/6838172", "Senhor dos Aneis", "Felipe", 125.90);

        livrariaOnline.exibirLivrosOrdenadosPorPreco();
        System.out.println("Todos Livros do Autor: " + livrariaOnline.pesquisarLivrosPorAutor("Pedro"));
        System.out.println("Livro Mais Caro Disponível: " + livrariaOnline.obterLivroMaisCaro());
        System.out.println("Livro Mais Barato Disponível: " + livrariaOnline.exibirLivroMaisBarato());

    }
}

package Map.PesquisaMap.EstoqueProdutoPreco;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    Map<Long, Produto> produtoMap;

    public EstoqueProdutos() {
        this.produtoMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco)
    {
        produtoMap.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos()
    {
        if(!produtoMap.isEmpty())
        {
            System.out.println(produtoMap);
        }
        else
        {
            System.out.println("O Map Esta Vazio!");
        }
    }

    public Double calcularValorTotalEstoque()
    {
        Double precoTotal = 0D;

        if(!produtoMap.isEmpty())
        {
            for (Produto p : produtoMap.values())
            {
                precoTotal += p.getPreco() * p.getQuantidade();
            }
        }
        else
        {
            System.out.println("O Map Esta Vazio!");
        }

        return precoTotal;
    }

    public Produto obterProdutoMaisCaro()
    {
        Produto produtoMaisCaro = null;
        Double maiorPreco = Double.MIN_VALUE;
        if(!produtoMap.isEmpty())
        {
            for (Produto p: produtoMap.values())
            {
                if(p.getPreco() > maiorPreco)
                {
                    produtoMaisCaro = p;
                    maiorPreco = p.getPreco();
                }
            }
        }
        else
        {
            System.out.println("O Map Esta Vazio!");
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato()
    {
        Produto produtoMaisBarato = null;
        Double menorPreco = Double.MAX_VALUE;

        if(!produtoMap.isEmpty())
        {
            for (Produto p: produtoMap.values())
            {
                if(p.getPreco() < menorPreco)
                {
                    produtoMaisBarato = p;
                    menorPreco = p.getPreco();
                }
            }
        }
        else
        {
            System.out.println("O Map Esta Vazio!");
        }
        return produtoMaisBarato;
    }


    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque()
    {
        Produto produtoValorQuantidadeTotal = null;
        double valorTotalProduto = Double.MIN_VALUE;
        if(!produtoMap.isEmpty())
        {
            for (Produto p: produtoMap.values())
            {
                if (valorTotalProduto < (p.getPreco() * p.getQuantidade()))
                {
                    produtoValorQuantidadeTotal = p;
                    valorTotalProduto = p.getPreco();
                }

            }
        }
        else
        {
            System.out.println("O Map Esta Vazio!");
        }
        return produtoValorQuantidadeTotal;
    }

    public static void main(String[] args) {

        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(13214, "Caneta", 4, 3.20);
        estoqueProdutos.adicionarProduto(14921, "Borracha", 5, 2.50);
        estoqueProdutos.adicionarProduto(93849, "Caderno", 1, 12.50);
        estoqueProdutos.adicionarProduto(94392, "Corretivo", 2, 15.50);

        estoqueProdutos.exibirProdutos();

        System.out.println(String.format("Valor Total dos Produtos:R$ %.2f", estoqueProdutos.calcularValorTotalEstoque()));
        System.out.println(estoqueProdutos.obterProdutoMaisCaro());
        System.out.println(estoqueProdutos.obterProdutoMaisBarato());
        System.out.println(estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
    }

}

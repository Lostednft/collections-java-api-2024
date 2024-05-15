package Set.OrdenacaoSet.CadastroProdutos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(nome, cod, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new Comparacao());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {

        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1234145, "Amanda", 304.50, 1);
        cadastroProdutos.adicionarProduto(1234145, "Luis", 250.12, 2);
        cadastroProdutos.adicionarProduto(6992812, "Junior", 220, 3);
        cadastroProdutos.adicionarProduto(9637829, "Samanta", 70.90, 1);

        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println("------------------------------------------------------");
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }
}

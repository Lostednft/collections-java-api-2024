package List.OperaçõesBasicasComList.CarrinhoCompras;

public class Item {

    private String nome;
    private Double preco;
    private int quantidade;

    public Item(String nome, Double pr, int quantidade) {
        this.nome = nome;
        this.preco = pr;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }
}
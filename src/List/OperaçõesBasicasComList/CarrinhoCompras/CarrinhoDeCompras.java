package List.OperaçõesBasicasComList.CarrinhoCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionaItem(String nome, double preco, int quantidade)
    {
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome)
    {
        List<Item> removeItem = new ArrayList<>();

        for (Item i : itemList)
        {
            if (i.getNome().equals(nome))
            {
                removeItem.add(i);
            }
        }

        itemList.removeAll(removeItem);
    }

    public void calcularValorTotal()
    {
        double valorTotal = 0;
        int quantidadeTotal = 0;
        for (Item i: itemList)
        {
           valorTotal += i.getPreco();
           quantidadeTotal += i.getQuantidade();
        }

        System.out.println("Valor Total: " + valorTotal);
        System.out.println("Quantidade Total: " + quantidadeTotal);

    }

    public void exibirItem()
    {
        System.out.println(itemList);
    }

    public static void main(String[] args) {

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionaItem("Prato", 60.50, 2);
        carrinhoDeCompras.adicionaItem("Copo", 80.00, 4);
        carrinhoDeCompras.adicionaItem("Panela", 160.00, 2);

        carrinhoDeCompras.exibirItem();
        carrinhoDeCompras.calcularValorTotal();

    }



}

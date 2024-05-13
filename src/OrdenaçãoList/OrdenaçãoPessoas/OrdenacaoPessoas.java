package OrdenaçãoList.OrdenaçãoPessoas;

import java.util.*;

public class OrdenacaoPessoas {
    List<Pessoa> pessoaList = null;

    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura)
    {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade()
    {
        Collections.sort(pessoaList);
        return pessoaList;
    }

    public List<Pessoa> ordenarPorAltura()
    {
        List<Pessoa> pessoas = new ArrayList<>(pessoaList);
        Collections.sort(pessoas, new ordenarPorAltura());
        return pessoas;
    }


    public static void main(String[] args) {

        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adicionarPessoa("Luis", 25, 1.51);
        ordenacaoPessoas.adicionarPessoa("Mariana", 15, 1.69);
        ordenacaoPessoas.adicionarPessoa("Pedro", 32, 1.75);
        ordenacaoPessoas.adicionarPessoa("Julia", 27, 1.73);
        System.out.println(ordenacaoPessoas.ordenarPorIdade());
        System.out.println(ordenacaoPessoas.ordenarPorAltura());
    }
}

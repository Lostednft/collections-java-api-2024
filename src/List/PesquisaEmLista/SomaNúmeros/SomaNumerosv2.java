package List.PesquisaEmLista.SomaNúmeros;

import java.util.List;

public class SomaNumerosv2
{

    //atributos
    List<Integer> numerosList;


    //TODO: Metodo para criar uma lista com um numero.
    public void adicionarNumero(int num)
    {
        numerosList.add(num);
    }

    public int calcularSoma()
    {
        int numeroTotal = 0;
        if(!numerosList.isEmpty())
        {
            for (Integer i: numerosList)
            {
                numeroTotal += i;
            }
        }
        return numeroTotal;
    }

    //TODO: Metodo para encontrar o maior numero da Lista de Numeros.
    public int encontrarMaiorNumero()
    {
        int numeroMaior = 0;
        if(!numerosList.isEmpty())
        {
            for (Integer i: numerosList)
            {
                if(numeroMaior <= i)
                {
                    numeroMaior = i;
                }
            }
        }
        return numeroMaior;
    }


    //TODO: Metodo para encontrar o menor numero da Lista de Numeros.
    public int encontrarMenorNumero()
    {
        int numeroMenor = Integer.MAX_VALUE;
        if(!numerosList.isEmpty())
        {
            for (Integer i: numerosList)
            {
                if(numeroMenor > i)
                {
                    numeroMenor = i;
                }
            }
        }
        return numeroMenor;
    }

    //TODO: Metodo para Exibir todos os numeros da Lista.
    public void exibirNumeros()
    {
        System.out.println(numerosList);
    }




    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(7);
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(8);

        System.out.println("Soma dos numeros: " + somaNumeros.calcularSoma());
        System.out.println("Maior Numero: " + somaNumeros.encontrarMaiorNumero());
        System.out.println("Menor Numero: " + somaNumeros.encontrarMenorNumero());

        System.out.print("Lista dos Numeros: ");
        somaNumeros.exibirNumeros();
    }
}

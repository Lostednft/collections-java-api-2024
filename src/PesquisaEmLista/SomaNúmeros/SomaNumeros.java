package PesquisaEmLista.SomaNúmeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    //atributos
    List<Numeros> numerosList;

    //construtor
    public SomaNumeros() {
        this.numerosList = new ArrayList<>();
    }


    //TODO: Metodo para criar uma lista com um numero.
    public void adicionarNumero(int num)
    {
        numerosList.add(new Numeros(num));
    }

    public int calcularSoma()
    {
        int numeroTotal = 0;
        if(!numerosList.isEmpty())
        {
            for (Numeros i: numerosList)
            {
                numeroTotal += i.getNumero();
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
            for (Numeros i: numerosList)
            {
                if(numeroMaior <= i.getNumero())
                {
                    numeroMaior = i.getNumero();
                }
            }
        }
        return numeroMaior;
    }


    //TODO: Metodo para encontrar o menor numero da Lista de Numeros.
    public int encontrarMenorNumero()
    {
        int numeroMenor = 0;
        int contador = 0;
        if(!numerosList.isEmpty())
        {
            for (Numeros i: numerosList)
            {
                if (contador < 1)
                {
                    numeroMenor = i.getNumero();
                }

                if(numeroMenor > i.getNumero())
                {
                    numeroMenor = i.getNumero();
                }
                contador++;
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

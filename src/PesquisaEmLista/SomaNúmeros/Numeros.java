package PesquisaEmLista.SomaNúmeros;

public class Numeros
{
    private int numero;

    public Numeros(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Numeros{" +
                "numero=" + numero +
                '}';
    }
}

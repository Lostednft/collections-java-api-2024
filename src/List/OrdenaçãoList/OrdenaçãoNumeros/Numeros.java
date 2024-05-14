package List.OrdenaçãoList.OrdenaçãoNumeros;

import java.util.Collections;
import java.util.Comparator;

public class Numeros implements Comparable<Numeros>
{

    int numero;

    public Numeros(int numero)
    {
        this.numero = numero;

    }

    @Override
    public int compareTo(Numeros p)
    {
        return Integer.compare(numero, p.getNumero());
    }

    public int getNumero()
    {
        return numero;
    }

    @Override
    public String toString()
    {
        return"numero=" + numero;
    }

}


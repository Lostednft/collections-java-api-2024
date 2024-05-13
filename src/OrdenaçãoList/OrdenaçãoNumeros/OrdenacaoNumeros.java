package OrdenaçãoList.OrdenaçãoNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros
{

    List<Numeros> numerosList = null;

    public OrdenacaoNumeros() {
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero)
    {
        numerosList.add(new Numeros(numero));
    }

    public List<Numeros> ordernarAscendente()
    {
        List<Numeros> pessoasAscendente = new ArrayList<>(numerosList);

        Collections.sort(pessoasAscendente);
        return pessoasAscendente;
    }

    public List<Numeros> ordenarDescendente()
    {
        List<Numeros> pessoasDescendente = new ArrayList<>(numerosList);

        Collections.sort(pessoasDescendente);

        return pessoasDescendente.reversed();
    }

    public static void main(String[] args)
    {

        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(5);
        ordenacaoNumeros.adicionarNumero(7);
        ordenacaoNumeros.adicionarNumero(3);
        ordenacaoNumeros.adicionarNumero(1);
        ordenacaoNumeros.adicionarNumero(13);

        System.out.println(ordenacaoNumeros.numerosList);
        System.out.println(ordenacaoNumeros.ordernarAscendente());
        System.out.println(ordenacaoNumeros.ordenarDescendente());
    }

}

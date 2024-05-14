package List.PesquisaEmLista.CatálogoLivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivro {

    private List<Livro> listaLivro;

    public CatalogoLivro() {
        this.listaLivro = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        listaLivro.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> listaPorAutor = new ArrayList<>();

        if (!listaLivro.isEmpty()) {
            for (Livro i : listaLivro) {
                if (i.getAutor().equalsIgnoreCase(autor)) {
                    listaPorAutor.add(i);
                }
            }
        }
        return listaPorAutor;
    }


    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal)
    {
        List<Livro> listaPesquisaIntervaloAnos = new ArrayList<>();

        if (!listaLivro.isEmpty()) {
            for (Livro i : listaLivro) {
                if (i.getAnoPublicacao() >= anoInicial && i.getAnoPublicacao() <= anoFinal) {
                    listaPesquisaIntervaloAnos.add(i);
                }
            }
        }

        return listaPesquisaIntervaloAnos;
    }


    public Livro pesquisarPorTitulo(String titulo)
    {
        Livro primeiroTitulo = null;

        for (Livro i: listaLivro)
        {
            if (i.getTitulo().equalsIgnoreCase(titulo))
            {
                primeiroTitulo = i;
                break;
            }
        }

        return primeiroTitulo;
    }


    public static void main(String[] args) {

        CatalogoLivro catalogoLivro = new CatalogoLivro();

        catalogoLivro.adicionarLivro("Titulo 1", "Autor 1", 2026);
        catalogoLivro.adicionarLivro("Titulo 2", "Autor 2", 2021);
        catalogoLivro.adicionarLivro("Titulo 1", "Autor 2", 2022);
        catalogoLivro.adicionarLivro("Titulo 4", "Autor 4", 2023);
        catalogoLivro.adicionarLivro("Titulo 4", "Autor 5", 2024);

        System.out.println(catalogoLivro.pesquisarPorAutor("Autor 2"));
        System.out.println(catalogoLivro.pesquisarPorIntervaloAnos(2021, 2023));
        System.out.println(catalogoLivro.pesquisarPorTitulo("Titulo 1"));
    }
}
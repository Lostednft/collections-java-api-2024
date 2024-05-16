package Map.OdenacaoMapa.AgendaEventos;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventoMap;

    public AgendaEventos()
    {
        this.eventoMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao)
    {
        eventoMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda()
    {
        Map<LocalDate, Evento> agendaOrdenada = new TreeMap<>(eventoMap);
        if (!eventoMap.isEmpty())
        {
            System.out.println(agendaOrdenada);
        }
        else
        {
            System.out.println("O Map esta Vazio!");
        }
    }

    public void obterProximoEvento()
    {
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate,Evento> eventoOrganizado = new TreeMap<>(eventoMap);
        if (!eventoMap.isEmpty())
        {
            for (var entry : eventoOrganizado.entrySet())
            {
                if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual))
                {
                    System.out.println(String.format("Proximo Evento: "+ entry.getValue() + " Proximo data: " + entry.getKey()));
                    break;
                }
            }
        }
        else
        {
            System.out.println("O Map esta Vazio!");
        }
    }

    public static void main(String[] args)
    {

        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2024, 6,15), "Rock Rio", "Travis Scott");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 8,25), "SP Festival", "Post Malone");
        agendaEventos.adicionarEvento(LocalDate.of(2025, 3,15), "Coachella", "Bruno Mars");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 9,2), "SuperBowl Halftime", "Kendrick Lamar");

        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();

    }
}

package Map.OdenacaoMapa.AgendaEventos;

public class Evento {

    //Atributes
    private String nomeEvento;
    private String nomeAtracao;

    public Evento(String nomeEvento, String nomeAtracao) {
        this.nomeEvento = nomeEvento;
        this.nomeAtracao = nomeAtracao;
    }

    public String getNomeAtracao() {
        return nomeAtracao;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    @Override
    public String toString() {
        return "{" +
                "nomeEvento='" + nomeEvento + '\'' +
                ", nomeAtracao='" + nomeAtracao + '\'' +
                '}';
    }
}

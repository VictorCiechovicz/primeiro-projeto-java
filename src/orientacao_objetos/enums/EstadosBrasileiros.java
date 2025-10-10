package orientacao_objetos.enums;

public enum EstadosBrasileiros {
    SAO_PAULO("SP", "São Paulo"),
    RIO_JANEIRO("RJ", "Rio de Janeiro"),
    PIAUI("PI", "Piauí"),
    MARANHAO("MA", "Maranhão");

    private String sigla;
    private String nome;


    private EstadosBrasileiros(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public String getSigla() {
        return this.sigla;
    }

}

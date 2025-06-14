public abstract class Pessoa {
    private String nome;
    private Instituicao instituicao;

    //construtor
    public Pessoa(String nome, Instituicao instituicao) {
        this.nome = nome;
        this.instituicao = instituicao;
    }

    //gets e sets
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Instituicao getInstituicao() {
        return instituicao;
    }
    public void setInstituicao(Instituicao instituicao) {
        this.instituicao = instituicao;
    }
}

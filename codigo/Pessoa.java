public abstract class Pessoa {
    private String nome;
    private Instituicao instituicao;

    //gets e sets
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setInstituicao(Instituicao instituicao) {
        this.instituicao = instituicao;
    }
    public String getNome() {
        return nome;
    }
    public Instituicao getInstituicao() {
        return instituicao;
    }
}

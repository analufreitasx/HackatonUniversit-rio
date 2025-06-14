public class Profissional extends Pessoa{
    private String profissao;

    public Profissional(String nome, Instituicao instituicao, String profissao){
        super(nome, instituicao);
        this.profissao = profissao;
    }

    public void setProfissao(String profissao){
        this.profissao = profissao;
    }
    public String getProfissao(){
        return profissao;
    }
}

public class Universidade extends Instituicao{
    private int idUniversidade;

    public Universidade(String nome, int idUniversidade) {
        this.nome = nome;
        this.idUniversidade = idUniversidade;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getIdUniversidade(){
        return idUniversidade;
    }
    public void setIdUniversidade(int idUniversidade){
        this.idUniversidade = idUniversidade;
    }
}

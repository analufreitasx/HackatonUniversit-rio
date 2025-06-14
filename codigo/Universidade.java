public class Universidade extends Instituicao{
    private int idUniversidade;
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setIdUniversidade(int idUniversidade){
        this.idUniversidade = idUniversidade;
    }
    public int getIdUniversidade(){
        return idUniversidade;
    }
}

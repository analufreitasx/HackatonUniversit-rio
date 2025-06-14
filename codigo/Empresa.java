public class Empresa extends Instituicao{
    private int cnpj;

    //gets e sets
    public void setNome(String nome){
        this.nome = nome;
    }
    public void getNome(String nome){
        return nome;
    }
    public int setCNPJ(int CNPJ){
        this.cnpj = cnpj;
    }
    public int getCNPJ(){
        return cnpj;
    }
}

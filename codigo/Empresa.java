public class Empresa extends Instituicao{
    private int cnpj;

    public void setNome(String Nome){
        this.nome = nome;
    }
    public void getNome(String Nome){
        return nome;
    }
    public int setCNPJ(int CNPJ){
        this.cnpj = cnpj;
    }
    public int getCNPJ(){
        return cnpj;
    }
}

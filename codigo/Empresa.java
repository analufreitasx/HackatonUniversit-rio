public class Empresa extends Instituicao{
    private int cnpj;

    public Empresa(String nome, int cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public void getNome(String nome){

        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getCNPJ(){

        return cnpj;
    }
    public int setCNPJ(int CNPJ){
        this.cnpj = cnpj;
    }
}

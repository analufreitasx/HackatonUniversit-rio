public class Empresa extends Instituicao{
    private int cnpj;

    public Empresa(String nome, int cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    @Override
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public int getCNPJ(){

        return cnpj;
    }
    public void setCNPJ(int CNPJ){
        this.cnpj = cnpj;
    }
}

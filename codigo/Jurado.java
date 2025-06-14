public class Jurado extends Profissional {
    private int idJurado;

    public Jurado(String nome, Instituicao instituicao, String profissao, int idJurado) {
        super(nome, instituicao, profissao);
        this.idJurado = idJurado;
    }

    public int getIdJurado() {
        return idJurado;
    }

    public void setIdJurado(int idJurado) {
        this.idJurado = idJurado;
    }
}

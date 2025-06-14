public class Estudante extends Pessoa {
    private int matricula;

    public Estudante(String nome, Instituicao instituicao, int matricula) {
        super(nome, instituicao);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}

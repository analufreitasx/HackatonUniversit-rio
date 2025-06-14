public class Projeto {
    private Profissional orientado;
    private Equipe equipe;
    private Int notaFinal;

    //gets e sets
    public void setProfissional(Profissional orientado) {
        this.orientado = orientado;
    }
    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }
    public void setNotaFinal(int notaFinal) {
        this.notaFinal = notaFinal;
    }
    public Profissional getOrientado() {
        return orientado;
    }
    public Equipe getEquipe() {
        return equipe;
    }
    public int getNotaFinal() {
        return notaFinal;
    }
}

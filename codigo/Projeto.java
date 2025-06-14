public class Projeto {
    private Profissional orientador;
    private Equipe equipe;
    private int notaFinal;
    private String nome;

    //gets e sets
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setProfissional(Profissional orientado) {
        this.orientador = orientado;
    }
    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }
    public void setNotaFinal(int notaFinal) {
        this.notaFinal = notaFinal;
    }
    public Profissional getOrientado() {
        return orientador;
    }
    public Equipe getEquipe() {
        return equipe;
    }
    public int getNotaFinal() {
        return notaFinal;
    }
    public String getNome() {
        return nome;
    }
}

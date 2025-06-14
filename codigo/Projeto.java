public class Projeto {
    private Profissional orientador;
    private Equipe equipe;
    private int notaFinal;
    private String nome;

    public Projeto(String nome, Profissional orientador, Equipe equipe) {
        this.nome = nome;
        this.orientador = orientador;
        this.equipe = equipe;
        this.notaFinal = 0;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Profissional getOrientador() {
        return orientador;
    }
    public void setProfissional(Profissional orientador) {
        this.orientador = orientador;
    }
    public Equipe getEquipe() {
        return equipe;
    }
    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }
    public int getNotaFinal() {
        return notaFinal;
    }
    public void setNotaFinal(int notaFinal) {
        this.notaFinal = notaFinal;
    }

    @Override
    public String toString() {
        return "Projeto: " + nome + ", Nota Final: " + notaFinal;
    }
}

import java.util.ArrayList;
import java.util.List;

public class Equipe {
    private String nome;
    private List<Estudante> integrantes = new ArrayList<>();

    public Equipe(String nome, List<Estudante> integrantes) {
        this.nome = nome;
        this.integrantes = integrantes;
    }

    public Equipe(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<Estudante> getIntegrantes() {
        return integrantes;
    }
    public void adicionarEstudante(Estudante estudante) {
        integrantes.add(estudante);
    }
}

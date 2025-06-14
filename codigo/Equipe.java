import java.util.ArrayList;
import java.util.List;

public class Equipe {
    private String nome;
    private List<Estudante> integrantes = new ArrayList<>();

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void adicionarEstudante(Estudante estudante) {
        integrantes.add(estudante);
    }
    public List<Estudante> getIntegrantes() {
        return integrantes;
    }
}

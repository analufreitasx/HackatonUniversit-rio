import java.util.ArrayList;
import java.util.List;

public class GerenciaEquipes {
    private static GerenciaEquipes instancia;
    private List<Equipe> listaEquipes;

    private GerenciaEquipes() {
        listaEquipes = new ArrayList<>();
    }

    public static GerenciaEquipes getInstancia() {
        if (instancia == null) {
            instancia = new GerenciaEquipes();
        }
        return instancia;
    }

    public void adicionarEquipe(Equipe equipe) {
        listaEquipes.add(equipe);
    }

    public List<Equipe> getTodasEquipes() {
        return listaEquipes;
    }

    public Equipe buscarPorNome(String nome) {
        for (Equipe equipe : listaEquipes) {
            if (equipe.getNome().equalsIgnoreCase(nome)) {
                return equipe;
            }
        }
        return null;
    }
}
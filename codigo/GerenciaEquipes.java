import java.util.ArrayList;
import java.util.List;

public class gerenciaEquipes {
    private static GerenciaEquipes instancia;
    private List<Equipe> listaEquipes;

    private GerenciaEquipes() {
        listaEquipes = new ArrayList<>();
    }

    public static GerenciaEquipes getInstancia() {
        if (instancia == null) {
            instancia = new Equipes();
        }
        return instancia;
    }

    public void adicionarEquipe(Equipe equipe) {
        listaEquipes.add(equipe);
    }

    public List<Equipe> getTodasEquipes() {
        return listaEquipes;
    }
}
import java.util.ArrayList;
import java.util.List;

public class GerenciaApresentacoes {
    private static GerenciaApresentacoes instancia;
    private List<Apresentacao> listaApresentacoes = new ArrayList<Apresentacao>();
    private GerenciaApresentacoes(){
    }
    public static GerenciaApresentacoes getInstancia(){
        if(instancia == null){
            instancia = new GerenciaApresentacoes();
        }
        return instancia;
    }

    public void adicionarApresentacao(Apresentacao apresentacao){
        listaApresentacoes.add(apresentacao);
    }

    public Apresentacao buscarApresentacao(Projeto projeto){
        for(Apresentacao apresentacao : listaApresentacoes){
            if(apresentacao.getProjeto().equals(projeto)){
                return apresentacao;
            }
        }
        return null;
    }
}

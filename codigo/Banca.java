import java.util.Map;

public class Banca implements Avaliavel {
    private Projeto projetoAvaliado;
    private Map<Jurado, Integer> jurados;

    public Banca(Projeto projetoAvaliado) {
        this.projetoAvaliado = projetoAvaliado;
    }

    public void setProjetoAvaliado(Projeto projetoAvaliado) {
        this.projetoAvaliado = projetoAvaliado;
    }

    public Projeto getProjetoAvaliado() {
        return projetoAvaliado;
    }

    public void addJuradoBanca(Jurado jurado) {
        jurados.put(jurado, 0);
    }

    public void CalcularNotaFinal(){
        int notaFinal = 0;
        for(Map.Entry<Jurado, Integer> jurado : jurados.entrySet()){
            notaFinal += jurado.getValue();
        }
        notaFinal /= jurados.size();
        projetoAvaliado.setNotaFinal(notaFinal);
    }

}

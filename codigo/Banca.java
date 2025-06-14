import java.util.Map;

public class Banca implements Avaliavel {
    private Projeto projetoAvaliado;
    private Map<Jurado, Integer> jurados;

    public Banca(Projeto projetoAvaliado, Jurado jurado, Jurado jurado2, Jurado jurado3, Jurado jurado4 ) {
        this.projetoAvaliado = projetoAvaliado;
        addJuradoBanca(jurado);
        addJuradoBanca(jurado2);
        addJuradoBanca(jurado3);
        addJuradoBanca(jurado4);
    }

    public void setProjetoAvaliado(Projeto projetoAvaliado) {
        this.projetoAvaliado = projetoAvaliado;
    }

    public Projeto getProjetoAvaliado() {
        return projetoAvaliado;
    }

    public void addJuradoBanca(Jurado jurado) {
        if(jurados.size() <= 4){
            jurados.put(jurado, 0);
        }
        else{
            System.out.println("Erro: Número máximo de jurados atingido.");
        }
    }

    @Override
    public void calcularNotaFinal(){
        int notaFinal = 0;
        for(Map.Entry<Jurado, Integer> jurado : jurados.entrySet()){
            notaFinal += jurado.getValue();
        }
        notaFinal /= jurados.size();
        projetoAvaliado.setNotaFinal(notaFinal);
    }

}

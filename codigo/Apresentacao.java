import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public class Apresentacao {
    private Projeto projeto;
    private Avaliavel banca;
    private Sala local;
    private LocalDateTime dataHora;

    public Apresentacao(Projeto projeto, Avaliavel banca, Sala local, LocalDateTime dataHora) {
        this.projeto = projeto;
        this.banca = banca;
        this.local = local;
        this.dataHora = dataHora;
    }

    public Projeto getProjeto() {
        return projeto;
    }
    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }
    public Avaliavel getBanca() {
        return banca;
    }
    public void setBanca(Avaliavel banca) {
        this.banca = banca;
    }
    public Sala getLocal() {
        return local;
    }
    public void setLocal(Sala local) {
        this.local = local;
    }
    public LocalDateTime getDataHora() {
        return dataHora;
    }
    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public void avaliar(List<Integer> notas) {
        if (banca instanceof Banca) {
            Banca bancaObj = (Banca) banca;
            Map<Jurado, Integer> jurados = bancaObj.getJurados();

            if (notas.size() < jurados.size()) {
                throw new IllegalArgumentException("Lista de notas menor que o número de jurados.");
            }

            int i = 0;
            for (Jurado jurado : jurados.keySet()) {
                jurados.replace(jurado, notas.get(i));
                i++;
            }
            bancaObj.setJurados(jurados);
        } else {
            throw new IllegalStateException("Objeto banca não é do tipo Banca.");
        }
    }
}

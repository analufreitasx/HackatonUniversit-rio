import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Instituicao universidade = new Universidade("PUC Minas", 1);
        Sala sala1 = new Sala(101);

        Equipe equipe1 = new Equipe("Equipe A");
        Equipe equipe2 = new Equipe("Equipe B");

        for (int i = 1; i <= 5; i++) {
            equipe1.adicionarEstudante(new Estudante("Aluno A" + i, universidade, 1000 + i));
            equipe2.adicionarEstudante(new Estudante("Aluno B" + i, universidade, 1000 + i));
        }

        GerenciaEquipes.getInstancia().adicionarEquipe(equipe1);
        GerenciaEquipes.getInstancia().adicionarEquipe(equipe2);

        Profissional orientador1 = new Profissional("Ana", universidade, "Professora de Programação Modular");
        Profissional orientador2 = new Profissional("Julia", universidade, "Professora de Web Design");

        Projeto projeto1 = new Projeto("Projeto A",orientador1, equipe1);
        Projeto projeto2 = new Projeto("Projeto B", orientador2, equipe2);

        Jurado jurado1 = new Jurado("Carlos", universidade, "Analista de Processos", 1);
        Jurado jurado2 = new Jurado("Rafael", universidade, "Especialista em IA", 2);
        Jurado jurado3 = new Jurado("Marina", universidade, "Desenvolvimento Web", 3);
        Jurado jurado4 = new Jurado("Daniela", universidade, "Segurança da Informação", 4);

        Jurado jurado5 = new Jurado("Kayke", universidade, "Engenharia de Software", 5);
        Jurado jurado6 = new Jurado("Joao", universidade, "Redes de Computadores", 6);
        Jurado jurado7 = new Jurado("Leticia", universidade, "Banco de Dados", 7);
        Jurado jurado8 = new Jurado("Isadora", universidade, "Cloud Computing", 8);

        Banca banca1 = new Banca(projeto1, jurado1, jurado2, jurado3, jurado4);
        Banca banca2 = new Banca(projeto2, jurado5, jurado6, jurado7, jurado8);

        Apresentacao apresentacao1 = new Apresentacao(projeto1, banca1, sala1, LocalDateTime.now());
        Apresentacao apresentacao2 = new Apresentacao(projeto2, banca2, sala1, LocalDateTime.now());
        GerenciaApresentacoes.getInstancia().adicionarApresentacao(apresentacao1);
        GerenciaApresentacoes.getInstancia().adicionarApresentacao(apresentacao2);

        apresentacao1.avaliar(Arrays.asList(8, 9, 7, 6));
        apresentacao2.avaliar(Arrays.asList(5, 6, 7, 6));

        banca1.calcularNotaFinal();
        banca2.calcularNotaFinal();

        System.out.println(apresentacao1.toString());
        System.out.println(apresentacao2.toString());
        System.out.println("Nota Final - Projeto 1: " + projeto1.getNotaFinal());
        System.out.println("Nota Final - Projeto 2: " +projeto2.getNotaFinal());

        GerenciaApresentacoes.getInstancia().getTodasApresentacoes().stream()
                .filter(aprov -> aprov.getProjeto().getNotaFinal() >= 7)
                .forEach(aprov -> System.out.println("Projeto aprovado: " + aprov.getProjeto().getNome() + " - Nota Final: " + aprov.getProjeto().getNotaFinal()));

    }
}

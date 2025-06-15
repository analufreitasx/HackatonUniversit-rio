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

        System.out.println("\n==== Listagem das Equipes e seus Alunos ====");
        for (Equipe equipe : GerenciaEquipes.getInstancia().getTodasEquipes()) {
            System.out.println(equipe.getNome() + ":");
            for (Estudante aluno : equipe.getIntegrantes()) {
                System.out.println("- " + aluno.getNome());
            }
            System.out.println();
        }

        System.out.println("\n==== Informações dos Projetos Criados ====");
        for (Apresentacao apresentacao : GerenciaApresentacoes.getInstancia().getTodasApresentacoes()) {
            Projeto projeto = apresentacao.getProjeto();
            System.out.println("Projeto: " + projeto.getNome());
            System.out.println("Equipe: " + projeto.getEquipe().getNome());
            System.out.println("Orientador: " + projeto.getOrientador().getNome() + " - " + projeto.getOrientador().getProfissao());
            System.out.println();
        }

        System.out.println("==== Jurados de Cada Banca ====");
        for (Apresentacao apresentacao : GerenciaApresentacoes.getInstancia().getTodasApresentacoes()) {
            Banca banca = (Banca) apresentacao.getBanca();
            System.out.println("Banca " + banca.getProjetoAvaliado().getNome() + ":");
            for (Jurado jurado : banca.getJurados().keySet()) {
                System.out.println("- " + jurado.getNome() + " (" + jurado.getProfissao() + ")");
            }
            System.out.println();
        }

        System.out.println("==== Notas e Média Final de Cada Projeto ====");
        for (Apresentacao apresentacao : GerenciaApresentacoes.getInstancia().getTodasApresentacoes()) {
            Projeto projeto = apresentacao.getProjeto();
            Banca banca = (Banca) apresentacao.getBanca();
            System.out.println("Notas " + projeto.getNome() + ":");
            for (Jurado jurado : banca.getJurados().keySet()) {
                System.out.println(jurado.getNome() + ": " + banca.getJurados().get(jurado));
            }
            System.out.println("Média Final: " + projeto.getNotaFinal());
            System.out.println();
        }

        System.out.println("==== Projetos Aprovados (Nota >= 7) ====");
        GerenciaApresentacoes.getInstancia().getTodasApresentacoes().stream()
                .filter(aprov -> aprov.getProjeto().getNotaFinal() >= 7)
                .forEach(aprov -> System.out.println("Projeto aprovado: " + aprov.getProjeto().getNome() + " - Nota Final: " + aprov.getProjeto().getNotaFinal()));
        
    }
}

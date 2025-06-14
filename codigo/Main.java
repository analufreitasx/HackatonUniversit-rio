import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Instituicao universidade = new Universidade("PUC Minas", 1);

        Equipe equipe1 = new Equipe("Equipe A");
        Equipe equipe2 = new Equipe("Equipe B");

        for (int i = 1, i <= 5; i++) {
            equipe1.adicionarEstudante(new Estudante("Aluno A" + i, universidade, 1000 + i));
            equipe2.adicionarEstudante(new Estudante("Aluno B" + i, universidade, 1000 + i));
        }

        Profissional orientador1 = new Profissional("Ana", universidade, "Professora");
        Profissional orientador2 = new Profissional("Julia", universidade, "Professora");

        Projeto projeto1 = new Projeto("Projeto A", equipe1, orientador1);
        Projeto projeto2 = new Projeto2("Projeto B", equipe2, orientador2);

        Jurado jurado1 = new Jurado("Carlos", universidade, "Analista de Processos", 1);
        Jurado jurado2 = new Jurado("Rafael", universidade, "Especialista em IA", 2);
        Jurado jurado3 = new Jurado("Marina", universidade, "Desenvolvimento Web", 3);
        Jurado jurado4 = new Jurado("Daniela", universidade, "Segurança da Informação", 4);

        Jurado jurado5 = new Jurado("Kayke", universidade, "Engenharia de Software", 5);
        Jurado jurado6 = new Jurado("Joao", universidade, "Redes de Computadores", 6);
        Jurado jurado7 = new Jurado("Leticia", universidade, "Banco de Dados", 7);
        Jurado jurado8 = new Jurado("Isadora", universidade, "Cloud Computing", 8);
    }
}

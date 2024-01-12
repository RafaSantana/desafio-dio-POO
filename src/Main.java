import java.time.LocalDate;

import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Javascript");
        curso2.setDescricao("Descrição do curso Javascript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição da mentoria de Java");
        mentoria.setData(LocalDate.now());

        Conteudo conteudo = new Mentoria();
        conteudo.setTitulo("Mentoria de Python");
        conteudo.setDescricao("Descrição da mentoria de Python");

        Conteudo conteudo2 = new Curso();
        conteudo2.setTitulo("Curso de Python");
        conteudo2.setDescricao("Descrição do curso de Python");

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
        System.out.println(conteudo);
        System.out.println(conteudo2);

    }
}

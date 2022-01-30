import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Descrição do curso de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de C#");
        curso2.setDescricao("Descrição do curso de C#");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria sobre Java");
        mentoria.setDescricao("Descrição da mentoria sobre Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devVictoria = new Dev();
        devVictoria.setNome("Victoria");
        devVictoria.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Victoria: " + devVictoria.getConteudosInscritos());
        devVictoria.progredir();
        devVictoria.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos de Victoria: " + devVictoria.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de Victoria: " + devVictoria.getConteudosConcluidos());
        System.out.println("XP: " + devVictoria.calcularTotalXp());

        System.out.println("-------");

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Maria: " + devMaria.getConteudosInscritos());
        devMaria.progredir();
        devMaria.progredir();
        devMaria.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos de Maria: " + devMaria.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos de Maria: " + devMaria.getConteudosConcluidos());
        System.out.println("XP: " + devMaria.calcularTotalXp());

    }

}
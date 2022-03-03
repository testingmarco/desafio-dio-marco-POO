import br.com.dio.desfio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricão curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricão curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDecricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());


        //System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java Developer");
        bootcamp.setDescricao("Descrição Bootcamp java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMarco = new Dev();
        devMarco.setNome("Marco");
        devMarco.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Marco" + devMarco.getConteudosInscritos());
        devMarco.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Marco" + devMarco.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Marco" + devMarco.getConteudosConcluidos());
        System.out.println("XP" + devMarco.calcularTotalXp());


        System.out.println("-------");

        Dev devJosivanja = new Dev();
        devJosivanja.setNome("Josivanja");
        devJosivanja.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Josivanja" + devJosivanja.getConteudosInscritos());
        devJosivanja.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Josivanja" + devJosivanja.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Josivanja" + devJosivanja.getConteudosConcluidos());
        System.out.println("XP" + devJosivanja.calcularTotalXp());

    }
}

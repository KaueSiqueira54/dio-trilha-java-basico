import desafio_dio.dominio.Bootcamp;
import desafio_dio.dominio.Curso;
import desafio_dio.dominio.Dev;
import desafio_dio.dominio.Mentoria;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso-Java");
        curso1.setDescricao("Curso java básico");
        curso1.setCargaHoraria(87);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso-Python");
        curso2.setDescricao("Curso Python básico");
        curso2.setCargaHoraria(67);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Aprendendo básico de java");
        mentoria.setDate(LocalDate.now());

         Bootcamp bootcamp = new Bootcamp();

         bootcamp.setNome("Desenvolvedor 1 Java");
         bootcamp.setDescricao("Desenvolvedor 1");
         bootcamp.getConteudos().add(curso1);
         bootcamp.getConteudos().add(curso2);
         bootcamp.getConteudos().add(mentoria);

         Dev devKaue = new Dev();
         devKaue.setNome("Kaue");
         devKaue.inscreverBootcamp(bootcamp);

         System.out.println("-------------------");
         System.out.println("Conteúdos inscritos Kaue" + devKaue.getConteudosIscritos());
         devKaue.progresso();
         devKaue.progresso();
         devKaue.progresso();
         System.out.println("Conteúdos inscritos Kaue" + devKaue.getConteudosIscritos());
         System.out.println("Conteúdos concluidos Kaue" + devKaue.getConteudosConcluidos());
         System.out.println("XP " + devKaue.calcularTotalXp());

         Dev devCamila = new Dev();
         devCamila.setNome("Camila");
         devCamila.inscreverBootcamp(bootcamp);

         System.out.println("-----------------------");
         System.out.println("Conteudos inscritos Camila" + devCamila.getConteudosIscritos());
         devCamila.progresso();
         System.out.println("Conteudos inscritos Camila" + devCamila.getConteudosIscritos());
         System.out.println("Conteúdos concluidos Camila" + devCamila.getConteudosConcluidos());
         System.out.println("XP " + devCamila.calcularTotalXp());

    }
     
}

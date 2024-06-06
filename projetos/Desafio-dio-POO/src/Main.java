
import desafio_dio.dominio.Curso;
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

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
    
}

package escola;

public class TesteJ {

    @Test
    void validar () {
        Aluno felipe = new Aluno();
        felipe.setNome("Felipe Kauâ");
        felipe.setIdade(17);

        System.out.println("O aluno 1 " + felipe.getNome() + " tem " + felipe.getIdade() + " anos.");
    }
}

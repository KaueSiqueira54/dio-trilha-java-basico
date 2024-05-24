public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa marcos = new Pessoa("Kaue", "122");
        marcos.setEndereco("RUA DOS JOÃOS");

        System.out.println(marcos.getNome() + "-" + marcos.getCpf());

    }
}

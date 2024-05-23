import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int numeroUm = terminal.nextInt();
        System.out.println("Digite o segundo número: ");
        int numeroDois = terminal.nextInt();

        try {
            contar(numeroUm, numeroDois);
            
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo número deve ser maior que o primeiro número para executar o programa!");
        }
    }

    static void contar(int numeroUm, int numeroDois) throws ParametrosInvalidosException {
        int contador = 0;
        int numero = numeroDois - numeroUm;

        if (numeroUm > numeroDois){
            throw new ParametrosInvalidosException();
        }
        else
            for (int numeros; numero > contador; contador++ ){
            System.out.println("Imprimindo o número " + contador);
        }
    }
}


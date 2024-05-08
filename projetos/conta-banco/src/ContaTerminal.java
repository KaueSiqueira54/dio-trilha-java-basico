import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("SEJA BEM VINDO(A)!");
        System.out.println("APRESENTE ALGUNS DADOS PARA PROSSEGUIR");

        System.out.println("Por favor, Digite seu Nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, Digite sua agência: ");
        String agencia = scanner.next();
    
        System.out.println("Por favor, Digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        
        System.out.println("Por favor, Digite o saldo disponovel: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + " , conta " + numeroConta + " e seu saldo " + saldo + " já está disponivel para saque.");

    }
}

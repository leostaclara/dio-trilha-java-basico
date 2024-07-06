import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

    double saldo = 237.48;
    //criando objeto scanner
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Por favor, digite o número da conta !");
    int contaNumero = scanner.nextInt();

    System.out.println("Por favor, digite o número da Agência !");
    String agencia = scanner.next();

    System.out.println("Por favor, digite o seu nome !");
    String nomeCliente = scanner.next();

    System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + contaNumero + " e seu saldo de " + "R$ " + saldo + " já está disponível para saque");
    }
}

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Por favor, digite o número da Agência: ");
        int numero = sc.nextInt();
        sc.nextLine();

        System.out.print("Por favor, digite a Agência: ");
        String agencia = sc.nextLine();

        System.out.print("Por favor, digite seu nome: ");
        String nomeCliente = sc.nextLine();

        System.out.print("Por favor, digite o valo para deposito: ");
        double saldo = sc.nextDouble();

        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque",
                nomeCliente,
                agencia, numero, saldo);

        sc.close();
    }
}

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    
        System.out.println("Por favor, digite o seu nome conforme documento oficial!");
        String nome = scanner.next();

        System.out.println("Por favor, digite o seu sobrenome!");
        String sobrenome = scanner.next();
        
        System.out.println("Digite o número da sua agência!");
        String agencia = scanner.next();

        System.out.println("Digite o número da sua conta!");
        int numero = scanner.nextInt();
        
        System.out.println("Digite o valor do saque");
        double saldo = scanner.nextDouble();

        System.out.println("Ola" + " " + nome + " " + sobrenome + "," + " " + "obrigado por criar uma conta em nosso banco!");
        System.out.println("A sua agência é a" + " " + agencia + "," + " " + "conta nº" + " " + numero + " " + "e o seu saldo de" + " " + saldo + " " + "já está disponível para saque!");

    }
}
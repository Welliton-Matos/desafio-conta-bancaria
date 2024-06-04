import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

       
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    
        System.out.println("Por favor, digite o seu nome");
        String nome = scanner.next();
        
        System.out.println("Digite seu sobrenome");
        String agencia = scanner.next();

        System.out.println("Digite sua idade");
        int numero = scanner.nextInt();
        
        System.out.println("Digite sua altura");
        double saldo = scanner.nextDouble();

    
        System.out.println("Olá" nome);
        
        
    }
}
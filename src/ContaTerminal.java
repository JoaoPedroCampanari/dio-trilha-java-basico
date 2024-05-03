import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência !");
        int numero= sc.nextInt();

        System.out.println("Por favor, digite a Agência !");
        String agencia= sc.next();

        sc.nextLine();

        System.out.println("Por favor, digite o seu Nome !");
        String nomeClient= sc.nextLine();

        System.out.println("Por favor, digite o saldo na Agência !");
        double saldo= sc.nextDouble();


        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %s já está disponível para saque.",nomeClient,agencia,numero,String.format("%.2f",saldo));


    }
}

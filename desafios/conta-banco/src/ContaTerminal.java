import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner in = new Scanner(System.in);

        System.out.println("| Terminal de banco |");
        System.out.println("Por favor, digite seu nome: ");

        String nome = in.nextLine();

        System.out.println("Digite o número da agência: ");

        int agencia = in.nextInt();
        in.nextLine();

        System.out.println("Digite o número da conta: ");

        String conta = in.nextLine();

        System.out.println("Digite seu saldo: ");
        double saldo = in.nextDouble();

        in.close();

        System.out.println("Olá "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+conta+" e seu saldo "+saldo+" já está disponível para saque.");


    }
}

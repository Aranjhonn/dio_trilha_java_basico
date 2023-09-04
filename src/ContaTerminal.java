import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência: ");
        int agencia = entrada.nextInt();

        System.out.println("Por favor, digite o número da Conta: ");
        String numeroConta = entrada.next();


        System.out.println("Por favor, digite o nome do Cliente: ");
        String nomeCliente = entrada.next();

        System.out.println("Por favor, digite o saldo da Conta: ");
        double saldoConta = entrada.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo é R$" + saldoConta + " já está disponível para saque.");

        entrada.close();
    }
}























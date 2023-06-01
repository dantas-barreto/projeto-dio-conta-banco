import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Seja bem vindo! Para iniciarmos o atendimento, digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Por favor, digite o numero da Agencia!: ");
        String agencia = sc.nextLine();

        System.out.println("Por favor, digite o numero da conta!: ");
        int conta = sc.nextInt();

        System.out.println("Para terminar, digite o saldo inicial da conta!: ");
        double saldo = sc.nextDouble();

        Conta c1 = new Conta(nome, agencia, conta, saldo);

        System.out.printf("Ola %s, obrigado por criar uma conta em nosso banco, sua agencia e %s, conta %d e seu saldo %.2f ja esta disponivel para saque", nome, agencia, conta, saldo);
    }
}
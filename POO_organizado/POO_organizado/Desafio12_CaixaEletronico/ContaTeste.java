import java.util.Scanner;

public class ContaTeste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome do titular da conta: ");
        String titular = entrada.nextLine();

        System.out.print("Digite o saldo inicial: ");
        double saldoInicial = entrada.nextDouble();

        Conta conta = new Conta(titular, saldoInicial);

        int opcao;

        do {
            System.out.println("\n--- MENU CAIXA ELETRÔNICO ---");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar saldo");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt();
            System.out.println();

            if (opcao == 1) {
                System.out.print("Digite o valor para depósito: ");
                double valorDeposito = entrada.nextDouble();
                conta.depositar(valorDeposito);
            } else if (opcao == 2) {
                System.out.print("Digite o valor para saque: ");
                double valorSaque = entrada.nextDouble();
                conta.sacar(valorSaque);
            } else if (opcao == 3) {
                conta.consultarSaldo();
            } else if (opcao == 4) {
                System.out.println("Sessão encerrada. Obrigado!");
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 4);

        entrada.close();
    }
}

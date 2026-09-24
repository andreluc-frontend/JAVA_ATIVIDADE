import java.util.Scanner;

public class ContaBancariaTeste {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Nome do titular: ");
        String t = teclado.nextLine();
        System.out.println("Número da Conta: ");
        String n = teclado.nextLine();

        ContaBancaria conta = new ContaBancaria(t, n);
        int opcao = 0;
        while(opcao != 4){
            System.out.println("\n ===MENU===");
            System.out.println("1- Depositar ");
            System.out.println("2- Sacar ");
            System.out.println("3- Consultar Saldo ");
            System.out.println("4- Sair ");


            opcao = teclado.nextInt();

            if(opcao == 1){
                System.out.println("Valor para depositar: ");

                double valor = teclado.nextDouble();
                conta.depositar(valor);

            }else if(opcao == 2){
                System.out.println("Valor para sacar: ");

                double valor = teclado.nextDouble();

            }else if(opcao == 3){
                conta.consultarSaldo();
            }else if(opcao == 4){
                System.out.println("Encerrando...");
            }else{
                System.out.println("Opção inválida!");
            }
        }
        teclado.close();
    }
}

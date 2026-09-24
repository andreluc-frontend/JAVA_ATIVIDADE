import java.util.Scanner;

public class EstacionamentoTeste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Estacionamento estacionamento = new Estacionamento(8.00);
        int opcao;

        do {
            System.out.println("\n--- MENU ESTACIONAMENTO ---");
            System.out.println("1 - Registrar entrada");
            System.out.println("2 - Registrar saída");
            System.out.println("3 - Consultar veículo");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt();
            entrada.nextLine();
            System.out.println();

            if (opcao == 1) {
                System.out.print("Digite a placa do veículo: ");
                String placa = entrada.nextLine();
                System.out.print("Digite o modelo do veículo: ");
                String modelo = entrada.nextLine();
                System.out.print("Digite a hora de entrada (inteiro): ");
                int horaEntrada = entrada.nextInt();

                Veiculo2 novoVeiculo = new Veiculo2(placa, modelo, horaEntrada);
                estacionamento.registrarEntrada(novoVeiculo);

            } else if (opcao == 2) {
                System.out.print("Digite a hora de saída (inteiro): ");
                int horaSaida = entrada.nextInt();
                estacionamento.registrarSaida(horaSaida);

            } else if (opcao == 3) {
                estacionamento.consultarVeiculo();

            } else if (opcao == 4) {
                System.out.println("Sistema encerrado!");
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 4);

        entrada.close();
    }
}

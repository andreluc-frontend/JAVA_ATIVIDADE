import java.util.Scanner;

public class CorridaTeste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome do passageiro: ");
        String passageiro = entrada.nextLine();

        System.out.print("Digite a distância da corrida (km): ");
        double distancia = entrada.nextDouble();

        Corrida corrida = new Corrida(passageiro, distancia);

        System.out.println();
        corrida.mostrarDados();

        entrada.close();
    }
}

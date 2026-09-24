import java.util.Scanner;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário: ");
        String nome = entrada.nextLine();

        System.out.print("Digite o cargo: ");
        String cargo = entrada.nextLine();

        System.out.print("Digite o salário: ");
        double salario = entrada.nextDouble();

        Funcionario func = new Funcionario(nome, cargo, salario);

        System.out.println();
        func.mostrarDados();

        System.out.print("Digite o percentual de aumento: ");
        double percentual = entrada.nextDouble();

        func.calcularAumento(percentual);

        System.out.println("\n--- PÓS AUMENTO ---\n");
        func.mostrarDados();

        entrada.close();
    }
}

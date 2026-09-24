import java.util.Scanner;

public class Aluno1Teste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = entrada.nextLine();

        System.out.print("Digite a matrícula: ");
        String matricula = entrada.nextLine();

        System.out.print("Digite a nota 1: ");
        double nota1 = entrada.nextDouble();

        System.out.print("Digite a nota 2: ");
        double nota2 = entrada.nextDouble();

        System.out.print("Digite a nota 3: ");
        double nota3 = entrada.nextDouble();

        Aluno1 aluno = new Aluno1(nome, matricula, nota1, nota2, nota3);

        System.out.println();
        aluno.mostrarDados();

        entrada.close();
    }
}

import java.util.Scanner;

public class Aluno3Teste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = entrada.nextLine();

        System.out.print("Digite a idade: ");
        int idade = entrada.nextInt();

        System.out.print("Digite o peso (kg): ");
        double peso = entrada.nextDouble();

        System.out.print("Digite a altura (m): ");
        double altura = entrada.nextDouble();

        Aluno3 aluno = new Aluno3(nome, idade, peso, altura);

        System.out.println();
        aluno.mostrarDados();

        entrada.close();
    }
}

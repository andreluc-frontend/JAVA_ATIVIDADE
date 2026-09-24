import java.util.Scanner;

public class Aluno2Teste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome do aluno 1: ");
        String nome1 = entrada.nextLine();
        System.out.print("Digite a matrícula do aluno 1: ");
        String mat1 = entrada.nextLine();
        Aluno2 aluno1 = new Aluno2(nome1, mat1);

        System.out.print("Digite o nome do aluno 2: ");
        String nome2 = entrada.nextLine();
        System.out.print("Digite a matrícula do aluno 2: ");
        String mat2 = entrada.nextLine();
        Aluno2 aluno2 = new Aluno2(nome2, mat2);

        System.out.print("Digite o nome do aluno 3: ");
        String nome3 = entrada.nextLine();
        System.out.print("Digite a matrícula do aluno 3: ");
        String mat3 = entrada.nextLine();
        Aluno2 aluno3 = new Aluno2(nome3, mat3);

        System.out.print("Digite o nome do aluno 4: ");
        String nome4 = entrada.nextLine();
        System.out.print("Digite a matrícula do aluno 4: ");
        String mat4 = entrada.nextLine();
        Aluno2 aluno4 = new Aluno2(nome4, mat4);

        System.out.print("Digite o nome do aluno 5: ");
        String nome5 = entrada.nextLine();
        System.out.print("Digite a matrícula do aluno 5: ");
        String mat5 = entrada.nextLine();
        Aluno2 aluno5 = new Aluno2(nome5, mat5);

        System.out.println("\n====== RESULTADOS ======");
        System.out.println("Aluno: " + aluno1.nome + " | Média: " + aluno1.calcularMedia(7.0, 8.5, 9.0));
        System.out.println("Aluno: " + aluno2.nome + " | Média: " + aluno2.calcularMedia(5.0, 6.0));
        System.out.println("Aluno: " + aluno3.nome + " | Média: " + aluno3.calcularMedia(8.0, 7.5, 9.0, 10.0));
        System.out.println("Aluno: " + aluno4.nome + " | Média: " + aluno4.calcularMedia(4.0, 5.5));
        System.out.println("Aluno: " + aluno5.nome + " | Média: " + aluno5.calcularMedia(10.0, 9.0, 9.5));

        entrada.close();
    }
}

import java.util.Scanner;

public class Aluno4Teste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome do curso: ");
        String nomeCurso = entrada.nextLine();

        System.out.print("Digite a carga horária do curso: ");
        int cargaHoraria = entrada.nextInt();
        entrada.nextLine();

        Curso curso = new Curso(nomeCurso, cargaHoraria);

        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = entrada.nextLine();

        System.out.print("Digite a matrícula do aluno: ");
        String matricula = entrada.nextLine();

        Aluno4 aluno = new Aluno4(nomeAluno, matricula, curso);

        System.out.println();
        aluno.mostrarDados();

        entrada.close();
    }
}

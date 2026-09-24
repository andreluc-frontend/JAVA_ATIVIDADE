import java.util.Scanner;

public class EscolaTeste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        Aluno5 aluno = null;
        Curso2 curso = null;
        Disciplina disciplina = null;
        Professor professor = null;
        
        int opcao;

        do {
            System.out.println("--- MENU SISTEMA ESCOLAR ---");
            System.out.println("1 - Cadastrar Curso");
            System.out.println("2 - Cadastrar Disciplina");
            System.out.println("3 - Cadastrar Professor");
            System.out.println("4 - Cadastrar Aluno");
            System.out.println("5 - Mostrar Aluno");
            System.out.println("6 - Mostrar Curso");
            System.out.println("7 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt();
            entrada.nextLine();
            System.out.println();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do curso: ");
                    String nomeCurso = entrada.nextLine();
                    System.out.print("Digite a carga horária do curso: ");
                    int chCurso = entrada.nextInt();
                    curso = new Curso2(nomeCurso, chCurso);
                    System.out.println("Curso cadastrado com sucesso!\n");
                    break;

                case 2:
                    System.out.print("Digite o nome da disciplina: ");
                    String nomeDisc = entrada.nextLine();
                    System.out.print("Digite a carga horária da disciplina: ");
                    int chDisc = entrada.nextInt();
                    disciplina = new Disciplina(nomeDisc, chDisc);
                    System.out.println("Disciplina cadastrada com sucesso!\n");
                    break;

                case 3:
                    System.out.print("Digite o nome do professor: ");
                    String nomeProf = entrada.nextLine();
                    System.out.print("Digite a especialidade do professor: ");
                    String espProf = entrada.nextLine();
                    professor = new Professor(nomeProf, espProf);
                    System.out.println("Professor cadastrado com sucesso!\n");
                    break;

                case 4:
                    if (curso == null) {
                        System.out.println("Erro: Cadastre um curso antes de matricular um aluno.\n");
                    } else {
                        System.out.print("Digite o nome do aluno: ");
                        String nomeAluno = entrada.nextLine();
                        System.out.print("Digite a matrícula do aluno: ");
                        String matAluno = entrada.nextLine();
                        aluno = new Aluno5(nomeAluno, matAluno, curso);
                        System.out.println("Aluno cadastrado com sucesso!\n");
                    }
                    break;

                case 5:
                    if (aluno == null) {
                        System.out.println("Nenhum aluno cadastrado no sistema.\n");
                    } else {
                        aluno.mostrarDados();
                    }
                    break;

                case 6:
                    if (curso == null) {
                        System.out.println("Nenhum curso cadastrado no sistema.\n");
                    } else {
                        System.out.println("====== DADOS DO CURSO ======");
                        System.out.println("Curso:         " + curso.nome);
                        System.out.println("Carga Horária: " + curso.cargaHoraria + " horas");
                        System.out.println("============================\n");
                    }
                    break;

                case 7:
                    System.out.println("Encerrando o sistema escolar...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.\n");
            }

        } while (opcao != 7);

        entrada.close();
    }
}

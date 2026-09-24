package Desafio17_ProblemaAberto_GestaoEscolar;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Paciente paciente1 = new Paciente(
                "Pedro",
                17,
                "12345678900"
        );

        Paciente paciente2 = new Paciente(
                "Lucas",
                20,
                "98765432100"
        );

        Medico medico1 = new Medico(
                "Ana",
                "Cardiologia",
                12345
        );

        Medico medico2 = new Medico(
                "Carlos",
                "Dermatologia",
                67890
        );

        Consulta consulta1 = new Consulta(
                paciente1,
                medico1,
                "25/09/2026",
                "08:00"
        );

        Consulta consulta2 = new Consulta(
                paciente2,
                medico2,
                "25/09/2026",
                "10:00"
        );

        int opcao = -1;

        while (opcao != 0) {

            System.out.println("\n===== CLÍNICA MÉDICA =====");
            System.out.println("1 - Ver pacientes");
            System.out.println("2 - Ver médicos");
            System.out.println("3 - Ver consultas");
            System.out.println("4 - Cancelar consulta");
            System.out.println("5 - Verificar maioridade");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("\n--- PACIENTES ---");

                    paciente1.mostrarDados();

                    System.out.println();

                    paciente2.mostrarDados();
                    break;

                case 2:
                    System.out.println("\n--- MÉDICOS ---");

                    medico1.mostrarDados();

                    System.out.println();

                    medico2.mostrarDados();
                    break;

                case 3:
                    consulta1.mostrarConsulta();
                    consulta2.mostrarConsulta();
                    break;

                case 4:

                    System.out.println("\nQual consulta deseja cancelar?");
                    System.out.println("1 - " + paciente1.getNome());
                    System.out.println("2 - " + paciente2.getNome());
                    System.out.print("Escolha: ");

                    int escolha = scanner.nextInt();

                    if (escolha == 1) {

                        consulta1.cancelarConsulta();
                        System.out.println("Consulta cancelada.");

                    } else if (escolha == 2) {

                        consulta2.cancelarConsulta();
                        System.out.println("Consulta cancelada.");

                    } else {

                        System.out.println("Opção inválida.");
                    }

                    break;

                case 5:

                    System.out.println("\n--- MAIORIDADE ---");

                    if (paciente1.verificarMaioridade()) {
                        System.out.println(
                                paciente1.getNome() + " é maior de idade."
                        );
                    } else {
                        System.out.println(
                                paciente1.getNome() + " é menor de idade."
                        );
                    }

                    if (paciente2.verificarMaioridade()) {
                        System.out.println(
                                paciente2.getNome() + " é maior de idade."
                        );
                    } else {
                        System.out.println(
                                paciente2.getNome() + " é menor de idade."
                        );
                    }

                    break;

                case 0:
                    System.out.println("Sistema encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}
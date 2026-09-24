import java.util.Scanner;

public class Musicbox {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);


        int escolha;

        do {
            System.out.println("\n ---|||°BEM VINDO A MUSICBOX°|||---");
            System.out.println("Escolha uma da escalas conhecidas de tônica Dó");
            System.out.println("1 - Escala Eólia");
            System.out.println("2 - Escala Jônia");
            System.out.println("3 - Escala Mixolídia");
            System.out.println("4 - Escala Dórica");
            System.out.println("5 - Escala Frígia");
            System.out.println("6 - Escala Lócria");
            System.out.println("7 - Escala Lídia");
            System.out.println("8 - Sair");
            System.out.print("Digite a sua opção: ");


            escolha = teclado.nextInt();

            if (escolha == 1) {
                System.out.println("\n-> Escala de Dó Eólio (Menor Natural):");
                System.out.println("Notas: C - D - Eb - F - G - Ab - Bb");
            } else if (escolha == 2) {
                System.out.println("\n-> Escala de Dó Jônio (Maior Natural):");
                System.out.println("Notas: C - D - E - F - G - A - B");
            } else if (escolha == 3) {
                System.out.println("\n-> Escala de Dó Mixolídio:");
                System.out.println("Notas: C - D - E - F - G - A - Bb");
            } else if (escolha == 4) {
                System.out.println("\n-> Escala de Dó Dórica:");
                System.out.println("Notas: C - D - Eb - F - G - A - Bb");
            } else if (escolha == 5) {
                System.out.println("\n-> Escala de Dó Frígia:");
                System.out.println("Notas: C - Db - Eb - F - G - Ab - Bb");
            } else if (escolha == 6) {
                System.out.println("\n-> Escala de Dó Lócria:");
                System.out.println("Notas: C - Db - Eb - F - Gb - Ab - Bb");
            } else if (escolha == 7) {
                System.out.println("\n-> Escala de Dó Lídia:");
                System.out.println("Notas: C - D - E - F# - G - A - B");
            } else if (escolha == 8) {
                System.out.println("\nSaindo do MUSICBOX... Até logo!");
            } else {
                System.out.println("\nOpção inválida! Tente novamente.");
            }


        } while (escolha != 8);


        teclado.close();
    }
}

import java.util.Scanner;

public class Produto1Teste {
    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o nome do produto: ");
        String nome = teclado.next();

        System.out.println("Digite o preço do produto: ");
        double preco = teclado.nextDouble();

        System.out.println("Digite a quantidade do produto: ");
        int quantidade = teclado.nextInt();

        Produto1 p1 = new Produto1(nome, preco, quantidade);

        System.out.printf("Valor total obtido: R$ %.2f%n", p1.calcularTotal());

        teclado.close();
    }
}

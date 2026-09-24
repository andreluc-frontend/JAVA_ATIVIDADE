import java.util.Scanner;

public class Produto2Teste {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o nome do produto: ");
        String nome = teclado.nextLine();

        System.out.println("Digite o codigo do produto: ");
        int codigo = teclado.nextInt();

        System.out.println("Digite o preço do produto: ");
        double preco = teclado.nextDouble();

        System.out.println("Digite a quantidade de estoque do produto: ");
        int estoque = teclado.nextInt();
        teclado.nextLine();

        Produto2 prod = new Produto2(codigo, nome, preco, estoque);

        prod.consultarEstoque();

        System.out.println("\n--- Testando as Operações ---");

        System.out.println("\nTentando vender " + (estoque + 5) + " unidades...");
        prod.vender(estoque + 5);

        System.out.println("\nAdicionando 10 unidades...");
        prod.adicionarEstoque(10);

        System.out.println("\nTentando vender 2 unidades...");
        prod.vender(2);

        prod.consultarEstoque();
        System.out.println("Valor total do estoque em R$: " + prod.calcularValorEstoque());

        teclado.close();
    }
}

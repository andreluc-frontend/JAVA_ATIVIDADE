import java.util.Scanner;

public class Pedido2Teste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String nomeProduto = entrada.nextLine();

        System.out.print("Digite o preço do produto: ");
        double precoProduto = entrada.nextDouble();
        entrada.nextLine();

        Produto3 produto = new Produto3(nomeProduto, precoProduto);

        System.out.print("Digite o número do pedido: ");
        int numeroPedido = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = entrada.nextLine();

        System.out.print("Digite a quantidade: ");
        int quantidade = entrada.nextInt();

        Pedido2 pedido = new Pedido2(numeroPedido, nomeCliente, produto, quantidade);

        System.out.println("\n====== RESUMO DO PEDIDO ======");
        System.out.println("Número do Pedido: " + pedido.numero);
        System.out.println("Cliente:          " + pedido.cliente);
        System.out.println("Produto:          " + pedido.produto.nome);
        System.out.println("Preço Unitário:   R$ " + pedido.produto.preco);
        System.out.println("Quantidade:       " + pedido.quantidade);
        System.out.println("Subtotal:         R$ " + pedido.calcularSubtotal());
        System.out.println("Desconto:         R$ " + pedido.calcularDesconto());
        System.out.println("Total Final:      R$ " + pedido.calcularTotal());
        System.out.println("==============================");

        entrada.close();
    }
}

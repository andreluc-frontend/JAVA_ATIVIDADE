public class Pedido1Teste {
    public static void main(String[] args) {
        Pedido1 pedido1 = new Pedido1("Carlos", "Coxinha", 3, 8.00);
        Pedido1 pedido2 = new Pedido1("Ana", "Combo Hambúrguer", 2, 35.00);
        Pedido1 pedido3 = new Pedido1("Bruno", "Cento de Salgados", 2, 60.00);

        imprimirResumoPedido(pedido1);
        imprimirResumoPedido(pedido2);
        imprimirResumoPedido(pedido3);
    }

    public static void imprimirResumoPedido(Pedido1 pedido) {
        System.out.println("====== RESUMO DO PEDIDO ======");
        System.out.println("Cliente: " + pedido.getNomeCliente());
        System.out.println("Produto: " + pedido.getProduto() + " (x" + pedido.getQuantidade() + ")");
        System.out.println("Preço Unitário: R$ " + pedido.getPrecoUnitario());
        System.out.println("Subtotal:       R$ " + pedido.calcularSubtotal());
        System.out.println("Desconto:       R$ " + pedido.calcularDesconto());
        System.out.println("Total Final:    R$ " + pedido.calcularTotal());
        System.out.println("==============================\n");
    }
}

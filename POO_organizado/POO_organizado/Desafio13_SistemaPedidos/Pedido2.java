public class Pedido2 {
    int numero;
    String cliente;
    Produto3 produto;
    int quantidade;

    public Pedido2(int numero, String cliente, Produto3 produto, int quantidade) {
        this.numero = numero;
        this.cliente = cliente;
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public double calcularSubtotal() {
        return this.quantidade * this.produto.preco;
    }

    public double calcularDesconto() {
        double subtotal = calcularSubtotal();
        double percentualDesconto = 0.0;

        if (subtotal >= 100.0 && subtotal < 200.0) {
            percentualDesconto = 0.05;
        } else if (subtotal >= 200.0) {
            percentualDesconto = 0.10;
        }

        return subtotal * percentualDesconto;
    }

    public double calcularTotal() {
        return calcularSubtotal() - calcularDesconto();
    }
}

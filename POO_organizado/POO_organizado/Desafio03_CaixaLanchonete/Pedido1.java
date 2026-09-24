public class Pedido1 {
    private String nomeCliente;
    private String produto;
    private int quantidade;
    private double precoUnitario;

    public Pedido1(String nomeCliente, String produto, int quantidade, double precoUnitario) {
        this.nomeCliente = nomeCliente;
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public double calcularSubtotal() {
        return this.quantidade * this.precoUnitario;
    }

    public double calcularDesconto() {
        double subtotal = calcularSubtotal();
        double percentualDesconto = 0.0;

        if (subtotal >= 50.0 && subtotal < 100.0) {
            percentualDesconto = 0.05;
        } else if (subtotal >= 100.0) {
            percentualDesconto = 0.10;
        }

        return subtotal * percentualDesconto;
    }

    public double calcularTotal() {
        return calcularSubtotal() - calcularDesconto();
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }
}

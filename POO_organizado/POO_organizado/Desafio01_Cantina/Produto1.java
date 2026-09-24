public class Produto1 {
    String nome;
    double preco;
    int quantidade;

    // Construtor
    public Produto1(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    double calcularTotal() {
        double total = this.preco * this.quantidade;

        if (total > 100.0) {
            total = total * 0.90;
        }

        return total;
    }
}

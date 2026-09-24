public class Produto2 {
    private int codigo;
    private String nome;
    private double preco;
    private int estoque;

    public Produto2(int codigo, String nome, double preco, int estoque) {
        this.codigo = codigo;

        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome.trim();
        } else {
            this.nome = "Produto Sem Nome";
        }

        if (preco >= 0) {
            this.preco = preco;
        } else {
            this.preco = 0.0;
            System.out.println("Aviso: Preço não pode ser negativo. Definido como 0.0");
        }

        if (estoque >= 0) {
            this.estoque = estoque;
        } else {
            this.estoque = 0;
            System.out.println("Aviso: Estoque não pode ser negativo. Definido como 0.");
        }
    }

    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.estoque += quantidade;
            System.out.println(quantidade + " unidades adicionadas ao estoque.");
        } else {
            System.out.println("Erro: Quantidade para adicionar deve ser maior que zero.");
        }
    }

    public void vender(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Erro: Quantidade de venda deve ser maior que zero.");
        } else if (quantidade > this.estoque) {
            System.out.println("Erro: Venda não realizada. Estoque insuficiente! Estoque atual: " + this.estoque);
        } else {
            this.estoque -= quantidade;
            double totalVenda = quantidade * this.preco;
            System.out.println("Venda realizada! Total: R$ " + totalVenda);
        }
    }

    public void consultarEstoque() {
        System.out.println("\n--- DADOS DO PRODUTO ---");
        System.out.println("Código: " + this.codigo);
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: R$ " + this.preco);
        System.out.println("Estoque atual: " + this.estoque + " unidades");
        System.out.println("------------------------");
    }

    public double calcularValorEstoque() {
        return this.estoque * this.preco;
    }
}

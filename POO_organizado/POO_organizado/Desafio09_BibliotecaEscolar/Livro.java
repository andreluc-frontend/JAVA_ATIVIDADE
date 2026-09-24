public class Livro {
    String titulo;
    String autor;
    String codigo;
    boolean disponivel;

    public Livro(String titulo, String autor, String codigo) {
        this.titulo = titulo;
        this.autor = autor;
        this.codigo = codigo;
        this.disponivel = true;
    }

    public void emprestar() {
        if (this.disponivel) {
            this.disponivel = false;
            System.out.println("O livro '" + this.titulo + "' foi emprestado com sucesso.");
        } else {
            System.out.println("Não foi possível emprestar. O livro '" + this.titulo + "' já está ocupado.");
        }
    }

    public void devolver() {
        if (!this.disponivel) {
            this.disponivel = true;
            System.out.println("O livro '" + this.titulo + "' foi devolvido com sucesso.");
        } else {
            System.out.println("Não foi possível devolver. O livro '" + this.titulo + "' já está na biblioteca.");
        }
    }

    public void mostrarDados() {
        System.out.println("====== DADOS DO LIVRO ======");
        System.out.println("Código:     " + this.codigo);
        System.out.println("Título:     " + this.titulo);
        System.out.println("Autor:      " + this.autor);
        System.out.println("Disponível: " + (this.disponivel ? "Sim" : "Não"));
        System.out.println("============================\n");
    }
}

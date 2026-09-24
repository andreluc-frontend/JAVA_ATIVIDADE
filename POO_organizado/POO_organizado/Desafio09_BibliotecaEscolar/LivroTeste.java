public class LivroTeste {
    public static void main(String[] args) {
        Livro livro1 = new Livro("O Hobbit", "Tolkien", "001");
        Livro livro2 = new Livro("Dom Casmurro", "Machado de Assis", "002");

        livro1.mostrarDados();
        livro2.mostrarDados();

        livro1.emprestar();
        livro2.emprestar();

        System.out.println();

        livro1.devolver();
        livro2.devolver();

        System.out.println();
        livro1.mostrarDados();
        livro2.mostrarDados();
    }
}


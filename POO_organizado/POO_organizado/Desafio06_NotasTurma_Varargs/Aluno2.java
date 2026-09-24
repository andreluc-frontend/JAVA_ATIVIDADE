public class Aluno2 {
    String nome;
    String matricula;

    public Aluno2(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public double calcularMedia(double... notas) {
        double soma = 0.0;
        for (double nota : notas) {
            soma += nota;
        }
        if (notas.length == 0) {
            return 0.0;
        }
        return soma / notas.length;
    }
}

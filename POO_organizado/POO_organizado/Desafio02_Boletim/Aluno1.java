public class Aluno1 {
    String nome;
    String matricula;
    double nota1;
    double nota2;
    double nota3;

    public Aluno1(String nome, String matricula, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double calcularMedia() {
        return (this.nota1 + this.nota2 + this.nota3) / 3.0;
    }

    public String verificarAprovacao() {
        double media = calcularMedia();

        if (media >= 6.0) {
            return "Aprovado";
        } else if (media >= 4.0) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }

    public void mostrarDados() {
        System.out.println("====== BOLETIM DO ALUNO ======");
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("Nome:      " + this.nome);
        System.out.println("Nota 1:    " + this.nota1);
        System.out.println("Nota 2:    " + this.nota2);
        System.out.println("Nota 3:    " + this.nota3);
        System.out.println("Média:     " + calcularMedia());
        System.out.println("Situação:  " + verificarAprovacao());
        System.out.println("==============================\n");
    }
}

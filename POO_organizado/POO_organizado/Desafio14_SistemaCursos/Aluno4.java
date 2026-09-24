public class Aluno4 {
    String nome;
    String matricula;
    Curso curso;

    public Aluno4(String nome, String matricula, Curso curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public void mostrarDados() {
        System.out.println("====== FICHA DO ALUNO ======");
        System.out.println("Nome do Aluno: " + this.nome);
        System.out.println("Matrícula:     " + this.matricula);
        System.out.println("Curso:         " + this.curso.nome);
        System.out.println("Carga Horária: " + this.curso.cargaHoraria + " horas");
        System.out.println("============================\n");
    }
}

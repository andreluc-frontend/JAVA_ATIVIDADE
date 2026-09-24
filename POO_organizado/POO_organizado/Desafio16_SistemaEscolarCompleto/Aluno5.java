public class Aluno5 {
    String nome;
    String matricula;
    Curso2 curso;

    public Aluno5(String nome, String matricula, Curso2 curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public void mostrarDados() {
        System.out.println("====== DADOS DO ALUNO ======");
        System.out.println("Nome:          " + this.nome);
        System.out.println("Matrícula:     " + this.matricula);
        System.out.println("Curso:         " + this.curso.nome);
        System.out.println("Carga Horária: " + this.curso.cargaHoraria + " horas");
        System.out.println("============================\n");
    }
}

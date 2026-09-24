package Desafio17_ProblemaAberto_GestaoEscolar;

public class Medico {

    String nome;
    String especialidade;
    int crm;

    public Medico(String nome, String especialidade, int crm) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.crm = crm;
    }

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Especialidade: " + especialidade);
        System.out.println("CRM: " + crm);
    }

    public String getNome() {
        return nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public int getCrm() {
        return crm;
    }
}
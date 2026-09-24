package Desafio17_ProblemaAberto_GestaoEscolar;

public class Paciente {

    String nome;
    int idade;
    String cpf;

    public Paciente(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("CPF: " + cpf);
    }

    public boolean verificarMaioridade() {
        if (idade >= 18) {
            return true;
        } else {
            return false;
        }
    }

    
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCpf() {
        return cpf;
    }
}
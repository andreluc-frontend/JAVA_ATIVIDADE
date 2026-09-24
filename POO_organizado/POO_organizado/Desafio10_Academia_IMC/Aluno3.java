public class Aluno3 {
    String nome;
    int idade;
    double peso;
    double altura;

    public Aluno3(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public double calcularIMC() {
        return this.peso / (this.altura * this.altura);
    }

    public String classificarIMC() {
        double imc = calcularIMC();

        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 25.0) {
            return "Peso normal";
        } else if (imc < 30.0) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
    }

    public void mostrarDados() {
        System.out.println("====== FICHA DO ALUNO ======");
        System.out.println("Nome:          " + this.nome);
        System.out.println("Idade:         " + this.idade + " anos");
        System.out.println("Peso:          " + this.peso + " kg");
        System.out.println("Altura:        " + this.altura + " m");
        System.out.println("IMC:           " + calcularIMC());
        System.out.println("Classificação: " + classificarIMC());
        System.out.println("============================\n");
    }
}


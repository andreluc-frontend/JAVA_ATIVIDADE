
public class Funcionario {
    String nome;
    String cargo;
    double salario;

    public Funcionario(String nome, String cargo, double salario){
        if(nome != null && !nome.trim().isEmpty()){
            this.nome = nome;
        }else{
            this.nome = "Não informado.";
        }

        if(cargo != null && !nome.trim().isEmpty()){
            this.cargo=cargo;
        }else{
            this.cargo = "Não informado.";
        }

        this.salario = salario;
    }


    void mostrarDados(){
        System.out.println("Nome do funcionario/a: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario: " + salario);
    }

    void calcularAumento(double percentual){
        this.salario += this.salario * (percentual / 100);
    }

}

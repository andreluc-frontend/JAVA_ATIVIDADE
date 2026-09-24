public class ContaBancaria {
    
    String titular;
    String numero;
    Double saldo;

    public ContaBancaria(String titular, String numero){
        this.titular = titular;
        this.numero = numero;
        this.saldo = 0.0;
    }

    void depositar(double valor){
        if(valor > 0){
            this.saldo += valor;
        System.out.println("Deposito de R$ " + valor + " realizada com sucesso!");
        }else{
            System.out.println("O valor do saldo deve ser positivo!");
        }
    }

    void sacar(double valor){
        if(valor <=0){
            System.out.println("Erro! O valor de saque deve ser acima de 0!");
        }else if(this.saldo < valor){
            System.out.println("Erro! Saldo insuficiente!");
        }else{
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + "realizada com suceso!");
        }
    }

    void consultarSaldo(){
System.out.println("Cliente: " + this.titular + "| Conta: " + this.numero);
System.out.println("Saldo: R$" + this.saldo);
    }
}

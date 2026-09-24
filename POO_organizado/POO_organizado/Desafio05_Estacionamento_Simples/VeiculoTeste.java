import java.util.Scanner;

public class VeiculoTeste{

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a placa do seu carro: ");
        String placa = teclado.next();

        System.out.println("Digite o modelo do seu carro: ");
        String modelo = teclado.next();

        System.out.println("Digite a quantidade de horas usadas: ");
        int horas = teclado.nextInt();


        double valorPagar;

        if(horas > 8){
            valorPagar = 50.0;
        }else if(horas<=0){
            valorPagar = 0.0;
        }else{
            valorPagar = 10.0 + (horas - 1) * 5.0;
        }

        System.out.println("\n=== COMPROVANTE DE PAGAMENTO ===");
        System.out.println("Modelo: " + modelo);
        System.out.println("Placa: " + placa);
        System.out.println("Tempo: " + horas + " hora(s)");
        System.out.println("Valor a pagar: R$ " + valorPagar);

        teclado.close();
    }
}
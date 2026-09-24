public class Veiculo {
    String placa;
    String modelo;
    int horasUsadas;

    public Veiculo(String placa, String modelo, int horasUsadas){
        this.placa = placa;
        this.modelo = modelo;
        this.horasUsadas = horasUsadas;
    }

        double calcularValor(){

            if(this.horasUsadas > 8){
                return 50.0;
            }

            if(this.horasUsadas <=0){
                return 0.0;
            }

            double valorTotal = 10.0 + (this.horasUsadas - 1) * 5.0;
            return valorTotal;
        }
}

public class Corrida {
    String passageiro;
    double distancia;

    public Corrida(String passageiro, double distancia) {
        this.passageiro = passageiro;
        this.distancia = distancia;
    }

    public double calcularValor() {
        double valor = 5.0 + (this.distancia * 2.50);
        
        if (this.distancia > 20.0) {
            valor = valor - (valor * 0.10);
        }
        
        return valor;
    }

    public void mostrarDados() {
        System.out.println("====== RESUMO DA CORRIDA ======");
        System.out.println("Passageiro:   " + this.passageiro);
        System.out.println("Distância:    " + this.distancia + " km");
        System.out.println("Valor Total:  R$ " + calcularValor());
        System.out.println("===============================\n");
    }
}

public class Estacionamento {
    Veiculo2 veiculoAtual;
    double valorPorHora;

    public Estacionamento(double valorPorHora) {
        this.valorPorHora = valorPorHora;
        this.veiculoAtual = null;
    }

    public void registrarEntrada(Veiculo2 veiculo) {
        if (this.veiculoAtual != null) {
            System.out.println("Erro: O estacionamento já possui um veículo ocupando a vaga.");
        } else {
            this.veiculoAtual = veiculo;
            System.out.println("Veículo " + veiculo.modelo + " registrado com sucesso!");
        }
    }

    public double calcularValor(int horaSaida) {
        if (this.veiculoAtual == null) {
            return 0.0;
        }
        int horasEstacionado = horaSaida - this.veiculoAtual.horaEntrada;
        if (horasEstacionado <= 0) {
            horasEstacionado = 1;
        }
        return horasEstacionado * this.valorPorHora;
    }

    public void registrarSaida(int horaSaida) {
        if (this.veiculoAtual == null) {
            System.out.println("Erro: Não há nenhum veículo no estacionamento para registrar a saída.");
        } else {
            double total = calcularValor(horaSaida);
            System.out.println("====== RECIBO DE SAÍDA ======");
            System.out.println("Modelo:       " + this.veiculoAtual.modelo);
            System.out.println("Placa:        " + this.veiculoAtual.placa);
            System.out.println("Hora Entrada: " + this.veiculoAtual.horaEntrada + "h");
            System.out.println("Hora Saída:   " + horaSaida + "h");
            System.out.println("Total Pago:   R$ " + total);
            System.out.println("=============================");
            this.veiculoAtual = null;
        }
    }

    public void consultarVeiculo() {
        if (this.veiculoAtual == null) {
            System.out.println("O estacionamento está vazio no momento.");
        } else {
            System.out.println("====== VEÍCULO ATUAL ======");
            System.out.println("Modelo:       " + this.veiculoAtual.modelo);
            System.out.println("Placa:        " + this.veiculoAtual.placa);
            System.out.println("Hora Entrada: " + this.veiculoAtual.horaEntrada + "h");
            System.out.println("===========================");
        }
    }
}


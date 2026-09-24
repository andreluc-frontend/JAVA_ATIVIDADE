package Desafio17_ProblemaAberto_GestaoEscolar;

public class Consulta {

    Paciente paciente;
    Medico medico;
    String data;
    String horario;
    String status;

    public Consulta(Paciente paciente, Medico medico, String data, String horario) {
        this.paciente = paciente;
        this.medico = medico;
        this.data = data;
        this.horario = horario;
        this.status = "Agendada";
    }

    public void mostrarConsulta() {
        System.out.println("\n--- CONSULTA ---");
        System.out.println("Paciente: " + paciente.getNome());
        System.out.println("Médico: " + medico.getNome());
        System.out.println("Especialidade: " + medico.getEspecialidade());
        System.out.println("Data: " + data);
        System.out.println("Horário: " + horario);
        System.out.println("Status: " + status);
    }

    public void cancelarConsulta() {
        status = "Cancelada";
    }

    public String getStatus() {
        return status;
    }
}

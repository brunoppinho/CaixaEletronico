package tech.ada.solid.o.correto;

public class CLTista implements CalculaRecebimento {

    @Override
    public double calculaSalario(double horasMensaisContratuais, double valorHora, double horasMensaisTrabalhadas) {
        double salario = 0;
        salario = horasMensaisContratuais * valorHora;
        salario += (horasMensaisTrabalhadas - horasMensaisContratuais) * 1.5 * valorHora;
        return salario;
    }
}

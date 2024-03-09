package tech.ada.solid.o.correto;

public class Terceirizado implements CalculaRecebimento {

    @Override
    public double calculaSalario(double horasMensaisContratuais, double valorHora, double horasMensaisTrabalhadas) {
        double salario = 0;
        salario = horasMensaisContratuais * valorHora;
        return salario;
    }
}

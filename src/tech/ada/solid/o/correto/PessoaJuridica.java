package tech.ada.solid.o.correto;

public class PessoaJuridica implements CalculaRecebimento {

    @Override
    public double calculaSalario(double horasMensaisContratuais, double valorHora, double horasMensaisTrabalhadas) {
        double salario = 0;
        salario = horasMensaisTrabalhadas * valorHora;
        return salario;
    }
}

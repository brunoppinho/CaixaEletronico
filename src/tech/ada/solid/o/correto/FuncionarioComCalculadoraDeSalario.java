package tech.ada.solid.o.correto;

public class FuncionarioComCalculadoraDeSalario extends Funcionario {

    private final CalculaRecebimento calculaRecebimento;

    public FuncionarioComCalculadoraDeSalario(double valorHora, double horasMensaisContratuais, double horasMensaisTrabalhadas, CalculaRecebimento calculaRecebimento) {
        super(valorHora, horasMensaisContratuais, horasMensaisTrabalhadas);
        this.calculaRecebimento = calculaRecebimento;
    }


    public double calculaSalario() {
        return calculaRecebimento.calculaSalario(getHorasMensaisContratuais(), getValorHora(),
                getHorasMensaisTrabalhadas());
    }
}

package tech.ada.solid.o.correto;

public class FuncionarioAgregado {

    public FuncionarioAgregado(CalculaRecebimento calculaRecebimento, Funcionario funcionario) {
        this.calculaRecebimento = calculaRecebimento;
        this.funcionario = funcionario;
    }

    private CalculaRecebimento calculaRecebimento;
    private Funcionario funcionario;

    public double calculaSalario() {
        return calculaRecebimento.calculaSalario(funcionario.getHorasMensaisContratuais(), funcionario.getValorHora(),
                funcionario.getHorasMensaisTrabalhadas());
    }
}

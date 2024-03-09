package tech.ada.solid.o.pattern;

public class FuncionarioAgregadoEnum {

    private TipoFuncionario tipoFuncionario;
    private Funcionario funcionario;

    public FuncionarioAgregadoEnum(TipoFuncionario tipoFuncionario, Funcionario funcionario) {
        this.tipoFuncionario = tipoFuncionario;
        this.funcionario = funcionario;
    }

    public double calculaSalario() {
        return tipoFuncionario.calculaSalario(funcionario.getHorasMensaisContratuais(), funcionario.getValorHora(),
                funcionario.getHorasMensaisTrabalhadas());    }
}

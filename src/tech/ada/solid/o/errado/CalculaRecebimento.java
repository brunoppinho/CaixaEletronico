package tech.ada.solid.o.errado;

public class CalculaRecebimento {

    public double calculaSalario(Funcionario funcionario) {
        double salario = 0;
        if ("CLT".equalsIgnoreCase(funcionario.getTipo())) {
            salario = funcionario.getHorasMensaisContratuais() * funcionario.getValorHora();
            salario += (funcionario.getHorasMensaisTrabalhadas() - funcionario.getHorasMensaisContratuais()) * 1.5 * funcionario.getValorHora();
        } else if ("PJ".equalsIgnoreCase(funcionario.getTipo())) {
            salario = funcionario.getHorasMensaisContratuais() * funcionario.getValorHora();

        } else if ("TERCEIRO".equalsIgnoreCase(funcionario.getTipo())) {
            salario = funcionario.getHorasMensaisTrabalhadas() * funcionario.getValorHora();

        } else {
            System.out.println("Objeto não tem um salário associado");
        }
        return salario;
    }

}

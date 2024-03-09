package tech.ada.solid.o.pattern;


import tech.ada.solid.o.correto.*;

public class Main {

    public static void main(String[] args) {
        FuncionarioComCalculadoraDeSalario clTista = new FuncionarioComCalculadoraDeSalario(10, 200, 300, new CLTista());
        FuncionarioAgregado funcionarioAgregado = new FuncionarioAgregado(new CLTista(), new tech.ada.solid.o.correto.Funcionario(10, 200, 300));
        FuncionarioAgregadoEnum funcionarioAgregadoEnum = new FuncionarioAgregadoEnum(TipoFuncionario.CLT, new Funcionario(10, 200, 300));

        System.out.println("O salário de F1 recebido foi de " + clTista.calculaSalario());
        System.out.println("O salário de F2 recebido foi de " + funcionarioAgregado.calculaSalario());
        System.out.println("O salário de F3 recebido foi de " + funcionarioAgregadoEnum.calculaSalario());
    }
}

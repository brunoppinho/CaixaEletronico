package tech.ada.solid.o.correto;

public class Main {

    public static void main(String[] args) {
        FuncionarioComCalculadoraDeSalario clTista = new FuncionarioComCalculadoraDeSalario(10, 200, 300, new CLTista());
        FuncionarioComCalculadoraDeSalario pessoaJuridica = new FuncionarioComCalculadoraDeSalario(10, 200, 300, new PessoaJuridica());
        FuncionarioComCalculadoraDeSalario terceirizado = new FuncionarioComCalculadoraDeSalario(10, 200, 300, new Terceirizado());

        FuncionarioAgregado funcionarioAgregado = new FuncionarioAgregado(new CLTista(), new Funcionario(10, 200, 300));

        System.out.println("O salário de F1 recebido foi de " + clTista.calculaSalario());
        System.out.println("O salário de F1' recebido foi de " + funcionarioAgregado.calculaSalario());
        System.out.println("O salário de F2 recebido foi de " + pessoaJuridica.calculaSalario());
        System.out.println("O salário de F3 recebido foi de " + terceirizado.calculaSalario());
    }
}

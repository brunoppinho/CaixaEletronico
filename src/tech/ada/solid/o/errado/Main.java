package tech.ada.solid.o.errado;

public class Main {

    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario(10, 200, 300, "CLT");
        Funcionario funcionario2 = new Funcionario(10, 200, 300, "PJ");
        Funcionario funcionario3 = new Funcionario(10, 200, 300, "TERCEIRO");

        CalculaRecebimento calculaRecebimento = new CalculaRecebimento();
        System.out.println("O salário de F1 recebido foi de " + calculaRecebimento.calculaSalario(funcionario1));
        System.out.println("O salário de F2 recebido foi de " + calculaRecebimento.calculaSalario(funcionario2));
        System.out.println("O salário de F3 recebido foi de " + calculaRecebimento.calculaSalario(funcionario3));
    }
}

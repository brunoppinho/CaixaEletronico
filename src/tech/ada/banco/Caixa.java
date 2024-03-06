package tech.ada.banco;


import tech.ada.banco.model.ContaCorrente;
import tech.ada.banco.model.Pessoa;
import tech.ada.banco.repository.ContaRepository;
import tech.ada.banco.repository.ContaRepositoryImpl;
import tech.ada.banco.service.api.AbrirConta;
import tech.ada.banco.service.api.Saque;
import tech.ada.banco.service.impl.AbrirContaImpl;
import tech.ada.banco.service.impl.SaqueImpl;

import java.math.BigDecimal;

public class Caixa {

    public static void main(String[] args) {
        ContaRepository contaRepository = new ContaRepositoryImpl();
        AbrirConta abrirConta = new AbrirContaImpl(contaRepository);
        Saque saque = new SaqueImpl(contaRepository);

        abrirConta.executar();
        saque.executar(BigDecimal.TEN, 0);
    }
}
/*
Criar uma classe que irá representar uma conta. Ela deve ter Saldo e número de conta
Criar uma classe que vai realizar o saque de uma conta. Ela deve receber o valor e o número da conta e deve alterar o saldo resultante dessa conta diminuindo assim o seu valor. Você deve fazer todas as validações que julgar pertinente.
Criar uma classe aonde eu vou abrir uma conta. Ou seja, criar uma conta nova.
Criar uma classe que vai realizar o depósito de uma conta. Ela deve receber o valor e o número da conta e deve alterar o saldo resultante dessa conta aumentando o seu valor. Você deve fazer todas as validações que julgar pertinente.

 */
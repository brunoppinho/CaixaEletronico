package tech.ada.banco.service.impl;

import tech.ada.banco.model.Conta;
import tech.ada.banco.repository.ContaRepository;
import tech.ada.banco.service.api.Saque;

import java.math.BigDecimal;

public class SaqueImpl implements Saque {

    private final ContaRepository contaRepository;

    public SaqueImpl(ContaRepository contaRepository) {
        this.contaRepository = contaRepository;
    }

    @Override
    public boolean executar(BigDecimal valor, int numerConta) {
        Conta conta = contaRepository.obterContaPeloNumero(numerConta);
        if(conta.getSaldo().compareTo(valor) > 0) {
            return false;
        }
        BigDecimal saldoFinal = conta.getSaldo().subtract(valor);
        conta.setSaldo(saldoFinal);
        contaRepository.save(conta);
        return true;
    }


}

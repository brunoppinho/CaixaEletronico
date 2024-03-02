package tech.ada.banco.service.impl;

import tech.ada.banco.model.Conta;
import tech.ada.banco.repository.ContaRepository;
import tech.ada.banco.repository.ContaRepositoryImpl;
import tech.ada.banco.service.api.AbrirConta;

public class AbrirContaImpl implements AbrirConta {

    private final ContaRepository contaRepository;

    public AbrirContaImpl(ContaRepository contaRepository) {
        this.contaRepository = contaRepository;
    }

    @Override
    public Conta executar() {
        Conta conta = new Conta();
        contaRepository.save(conta);
        return conta;
    }
}

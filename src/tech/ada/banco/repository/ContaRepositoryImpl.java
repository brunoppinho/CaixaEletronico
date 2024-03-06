package tech.ada.banco.repository;

import tech.ada.banco.model.Conta;

public class ContaRepositoryImpl extends MemoryRepository<Conta> implements ContaRepository {

    @Override
    public Conta obterContaPeloNumero(int numerConta) {
        return objetos.stream()
                .filter(conta -> conta.getNumeroConta() == numerConta)
                .findFirst()
                .orElse(null);
    }
}

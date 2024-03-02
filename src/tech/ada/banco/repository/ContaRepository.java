package tech.ada.banco.repository;

import tech.ada.banco.model.Conta;

public interface ContaRepository extends Repository<Conta> {

    Conta obterContaPeloNumero(int numerConta);

}

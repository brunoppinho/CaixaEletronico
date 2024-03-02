package tech.ada.banco.repository;

import tech.ada.banco.model.Conta;

public class ContaRepositoryImpl extends MemoryRepository<Conta> implements ContaRepository {

    @Override
    public Conta save(Conta o) {
        if (o.getId() != null) {
            o.setId(objetos.size());
            objetos.add(o);
        } else {
            Conta contaAntiga = objetos.get(o.getId());
            objetos.remove(contaAntiga);
            objetos.add(o.getId(), o);
        }
        return o;
    }

    @Override
    public Conta obterContaPeloNumero(int numerConta) {
        return objetos.stream()
                .filter(conta -> conta.getNumeroConta() == numerConta)
                .findFirst()
                .orElse(null);
    }
}

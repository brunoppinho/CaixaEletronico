package tech.ada.banco.repository;

import tech.ada.banco.model.ClasseComId;
import tech.ada.banco.model.Conta;

import java.util.ArrayList;
import java.util.List;

public abstract class MemoryRepository<T extends ClasseComId> implements Repository<T> {

    protected List<T> objetos = new ArrayList<>();

    @Override
    public T findById(int id) {
        return objetos.get(id);
    }

    @Override
    public List<T> findAll() {
        return objetos;
    }

    @Override
    public void delete(T o) {
        objetos.remove(o);
    }

    @Override
    public T save(T o) {
        if (o.getId() == null) {
            o.setId(objetos.size());
            objetos.add(o);
        } else {
            T objetoAntigo = objetos.get(o.getId());
            objetos.remove(objetoAntigo);
            objetos.add(o.getId(), o);
        }
        return o;
    }
}

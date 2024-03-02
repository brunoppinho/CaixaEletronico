package tech.ada.banco.repository;

import java.util.ArrayList;
import java.util.List;

public abstract class MemoryRepository<T> implements Repository<T> {

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
}

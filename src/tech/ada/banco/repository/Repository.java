package tech.ada.banco.repository;

import java.util.List;

public interface Repository<T> {

    T save(T o);

    void delete(T o);

    T findById(int id);

    List<T> findAll();
}

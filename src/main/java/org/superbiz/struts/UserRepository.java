package org.superbiz.struts;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository implements CrudRepository<User, Long> {

    @Override
    public <S extends User> S save(S s) {
        return null;
    }

    @Override
    public <S extends User> Iterable<S> save(Iterable<S> iterable) {
        return null;
    }

    @Override
    public User findOne(Long aLong) {
        return null;
    }

    @Override
    public boolean exists(Long aLong) {
        return false;
    }

    @Override
    public Iterable<User> findAll() {
        return null;
    }

    @Override
    public Iterable<User> findAll(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void delete(Long aLong) {

    }

    @Override
    public void delete(User user) {

    }

    @Override
    public void delete(Iterable<? extends User> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
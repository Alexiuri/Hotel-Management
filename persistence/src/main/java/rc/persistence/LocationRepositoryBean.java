package rc.persistence;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import rc.domain.Location;

import java.util.List;
import java.util.Optional;

public class LocationRepositoryBean implements LocationRepository {
    @Override
    public List<Location> findAll() {
        return null;
    }

    @Override
    public List<Location> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Location> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Location> findAllById(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Location location) {

    }

    @Override
    public void deleteAll(Iterable<? extends Location> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Location> S save(S s) {
        return null;
    }

    @Override
    public <S extends Location> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Location> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Location> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<Location> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Location getOne(Long aLong) {
        return null;
    }

    @Override
    public <S extends Location> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Location> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Location> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Location> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Location> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Location> boolean exists(Example<S> example) {
        return false;
    }
}

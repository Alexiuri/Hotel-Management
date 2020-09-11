package rc.persistence;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import rc.domain.Hotel;

import java.util.List;
import java.util.Optional;

public class HotelRepositoryBean implements HotelRepository {
    @Override
    public List<Hotel> findAll() {
        return null;
    }

    @Override
    public List<Hotel> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Hotel> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Hotel> findAllById(Iterable<Long> iterable) {
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
    public void delete(Hotel hotel) {

    }

    @Override
    public void deleteAll(Iterable<? extends Hotel> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Hotel> S save(S s) {
        return null;
    }

    @Override
    public <S extends Hotel> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Hotel> findById(Long aLong) {
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
    public <S extends Hotel> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<Hotel> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Hotel getOne(Long aLong) {
        return null;
    }

    @Override
    public <S extends Hotel> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Hotel> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Hotel> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Hotel> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Hotel> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Hotel> boolean exists(Example<S> example) {
        return false;
    }
}

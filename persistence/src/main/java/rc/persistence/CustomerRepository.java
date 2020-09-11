package rc.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rc.domain.Customer;
import rc.domain.Hotel;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
}

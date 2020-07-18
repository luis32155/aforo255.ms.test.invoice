package aforo255.ms.tes.invoice.repository;
import org.springframework.data.repository.CrudRepository;

import aforo255.ms.tes.invoice.model.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer>{

}

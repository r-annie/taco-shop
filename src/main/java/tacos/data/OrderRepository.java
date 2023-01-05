package tacos.data;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tacos.TacoOrder;

import java.util.Date;
import java.util.List;

@Repository
public interface OrderRepository extends CrudRepository<TacoOrder, Long> {
}

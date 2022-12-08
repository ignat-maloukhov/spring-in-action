package edu.ignat.springinaction.repository;

import edu.ignat.springinaction.model.TacoOrder;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {
}

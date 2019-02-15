package br.com.microservice.architecture.application.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.microservice.architecture.application.model.Order;

@Repository
public interface OrderRepository extends CrudRepository<Order, Integer> {
	
	@Query(" SELECT o FROM Order o WHERE id = :id")
	Order findOne(@Param("id") Integer id);

}

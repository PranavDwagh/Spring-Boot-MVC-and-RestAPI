package study;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import study.Entity.ProductEntity;


@Repository // you write @component or @service as well..all are same
public interface MyRepository extends JpaRepository<ProductEntity, Integer> {
	
}



//DataSource
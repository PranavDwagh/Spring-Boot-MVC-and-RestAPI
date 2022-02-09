package study;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import study.entity.GroceryEntity;

@Repository   // @component// @services
public interface MyRepository extends JpaRepository<GroceryEntity, Integer> {
	
		// WRITE CUSTOME REPOSITORY METHODS HERE 
}

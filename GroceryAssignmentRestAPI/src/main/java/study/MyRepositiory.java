package study;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import study.entity.GroceryEntity;

@Repository
public interface MyRepositiory extends JpaRepository<GroceryEntity,Integer> {
	
	
	@Query(value = "select * from grocery123 a where a.product_name = :name", nativeQuery = true )
	public List<GroceryEntity> findByName(  @Param("name")  String name);
	
}

package study;

import org.springframework.data.jpa.repository.JpaRepository;

import study.entity.ProductEntity;

public interface MyRepository extends JpaRepository<ProductEntity, Integer> {

}

package study;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import study.entity.BookEntity;

@Repository
public interface MyRepository extends JpaRepository<BookEntity,Integer> {

	 public List<BookEntity> findByBookCost(int bcost);
	 public List<BookEntity> findByBookName(String bname);
	
	 
	//JPQL @Query("from study.entity.BookEntity a  where  a.bookCost<:pCost") 
	 @Query(value = "select * from book12 a  where  a.book_cost<:pCost", nativeQuery = true)
	 public List<BookEntity> findByCostLessThan(@Param("pCost") int cost);
}







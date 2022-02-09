package study;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import study.DAO.BookDAO;
import study.entity.BookEntity;

@Component
public interface MyRepositiory extends JpaRepository<BookEntity, Integer> {

	
	//@Query(value = "select * from Book_Entity123 a where a.name = :name", nativeQuery = true)
	public List<BookEntity> findByBookName(String name);
	public List<BookEntity> findByBookCost(int cost);
	
	// @Query(value = "select * from book12 a  where  a.book_cost<:pCost",nativeQuery = true)
	@Query(value = "select * from Book_Entity123 a where a.book_cost< :cost", nativeQuery = true)
	public List<BookEntity> findBookCostLessThan(@Param(value = "cost") int cost);
	

	// TODO
	
}

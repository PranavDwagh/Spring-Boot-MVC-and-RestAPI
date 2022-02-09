package study;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import study.entity.BookEntity;

@Repository
public interface MyRepository extends JpaRepository<BookEntity, Integer> {

	@Query(value = "select a.book_id from book a", nativeQuery = true)
	public List<Integer> getId();
	
	
}



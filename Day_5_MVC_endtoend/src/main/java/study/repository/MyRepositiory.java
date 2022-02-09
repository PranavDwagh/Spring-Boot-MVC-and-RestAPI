package study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import study.entity.BookEntity;

@Repository
public interface MyRepositiory extends JpaRepository<BookEntity, Integer> {
}

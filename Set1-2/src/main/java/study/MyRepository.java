package study;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import study.entity.PlannerEntity;

@Repository
public interface MyRepository extends JpaRepository<PlannerEntity, Integer> {

}

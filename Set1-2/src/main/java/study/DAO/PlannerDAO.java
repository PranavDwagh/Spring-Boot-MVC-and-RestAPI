package study.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import study.MyRepository;
import study.entity.PlannerEntity;

@Service
public class PlannerDAO {

	@Autowired
	MyRepository rs;

	public List<PlannerEntity> getAllPlan() {
		
		List<PlannerEntity> list =  rs.findAll();
		return list;
	}

	public void update(int id, String is_done) {
		
		PlannerEntity obj = rs.findById(id).get();
		
		if(obj!=null)
		{
			if(is_done.equals("true"))
			obj.setIsDone(true);
			else
				obj.setIsDone(false);
			rs.save(obj);
		}
	}
	
}

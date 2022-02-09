package study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import study.MyRepository;
import study.DAO.PlannerDAO;
import study.entity.PlannerEntity;

@RestController
@RequestMapping("/plan")
public class PlannerController {
	
	@Autowired
	PlannerDAO dao;
	
	@GetMapping("/allplans")
	public List<PlannerEntity> allPlans()
	{
		List<PlannerEntity> list = dao.getAllPlan();
		return list;
	}
	
	@PostMapping("/updateplan")
	public void update(@RequestParam int id,@RequestParam String is_done)
	{
		dao.update(id, is_done);
	}
	
	
}

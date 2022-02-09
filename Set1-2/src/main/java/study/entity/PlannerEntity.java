package study.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="planner_info_tbl")
public class PlannerEntity {
	
	@Id
	@Column(name="id")
	private int id;
	@Column(name="date")
	private String date;
	@Column(name="task")
	private String task;
	@Column(name="is_done")
	private boolean isDone;
	public PlannerEntity(int id, String date, String task, boolean isDone) {
		super();
		this.id = id;
		this.date = date;
		this.task = task;
		this.isDone = isDone;
	}
	
	public PlannerEntity() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public boolean getIsDone() {
		return isDone;
	}

	public void setIsDone(boolean isDone) {
		this.isDone = isDone;
	}
	
	

}

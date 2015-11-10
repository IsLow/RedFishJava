package Postit;

import java.util.Date;

public class Reman extends Unique{
	private RemanCategory type;

	public Reman(String name, Date targetDate, RemanCategory type){
		super(name, targetDate);
		this.type = type;
		this.targetDate = targetDate;
	}
	
	public Reman(String name, String description, Date targetDate, RemanCategory type){
		super(name, description, targetDate);
		this.type = type;
		this.targetDate = targetDate;
	}
	
	public Reman(String name, String description, String priority, Date targetDate, RemanCategory type){
		super(name, description, priority, targetDate);
		this.type = type;
		this.targetDate = targetDate;
	}
	
	public RemanCategory getType(){
		return this.type;
	}
	
	public void setType(RemanCategory type){
		this.type = type;
	}
}

package Postit;

import java.util.Date;

public class Unique extends Postit {
	protected Date targetDate;
	
	public Unique(String name, Date targetDate){
		super(name);
		this.targetDate = targetDate;
	}
	
	public Unique(String name, String description, Date targetDate){
		super(name, description);
		this.targetDate = targetDate;
	}
	
	public Unique(String name, String description, String priority, Date targetDate){
		super(name, description, priority);
		this.targetDate = targetDate;
	}
	
	
	public Date getTargetDate(){
		return this.targetDate;
	}
	
	public void setTargetDate(Date targetDate){
		this.targetDate = targetDate;
	}
}

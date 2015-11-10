package Postit;

import java.util.Date;

import javax.swing.JOptionPane;

public class Postit {

	protected String name;
	protected String description;
	protected String priority;
	protected Date dateCreation;
	

	public Postit() {
		this.dateCreation = new Date();
	}
	
	public Postit(String name){
		this.name = name;
		this.dateCreation = new Date();
	}
	
	public Postit(String name, String description){
		this.name = name;
		this.dateCreation = new Date();
		this.description = description;
	}
	
	public Postit(String name, String description, String priority){
		this.name = name;
		this.dateCreation = new Date();
		this.description = description;
		this.priority = priority;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getDescription(){
		return this.description;
	}
	
	public void setDescription(String description){
		this.description = description;
	}
	
	public String getPriority(){
		return this.priority;
	}
	
	public void setPriority(String priority){
			this.priority = priority;
	}
	
	public Date getDateCreation(){
		return this.dateCreation;
	}
	
	public String getInfo(){
		String info;
		info = "Nom : ".concat(this.getName());
		if(!this.getDescription().equals(null)){
			info += "\nDescription : ".concat(this.getDescription());
		}
		if(!this.getPriority().equals(null)){
			info += "\nPriorité : " .concat(this.getPriority());
		}
		return info;		
	}
}

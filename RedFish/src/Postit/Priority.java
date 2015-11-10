package Postit;

public enum Priority {
	B ("Basse"),
	M("Moyenne"),
	H("Haute"),
	U("Urgente");
	
	private String name;
	
	Priority(String name){
		this.name = name;
	}
	
	public String toString(){
		return this.name;
	}
}

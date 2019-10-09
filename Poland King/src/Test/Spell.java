package Test;

public class Spell {
	private String name;
	private double dmg;
	//int cooldown
	private String description;
	
	//default init
	public Spell() {
		System.out.println("Spell create !");
		name = "It's a Match !";
		description = "You're the most beautiful of the world everybody want your perfect Body \n\nHeal 200 Pv";
		
	}
	
	//Precise init 
	public Spell(String sName , double sDmg , String sDescription ) {
		name = sName;
		dmg = sDmg;
		description = sDescription;
	}
	
	//Name
	
	public String  getName() {
		return name;
	}
	//Damages
	
	public double getDmg() {
		return dmg;
	}
	
	//Description
	
	public String setDescription() {
		return description;
	}
}

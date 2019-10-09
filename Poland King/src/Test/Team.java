package Test;

public class Team {
	private String name;
	private Hero [] heroList;
	//Buff buff;
	
	public Team() {
		System.out.println("A New Team is born !");
		name = "Schtruddle";
		heroList =  new Hero[3];
		
	}
	
	public Team(String tName , Hero[] tHeroList) {
		name = tName;
		heroList = tHeroList;
	}
	
	//Name
	
	public String  getName() {
		return name;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	//Hero list 
	
	public Hero[]  getTeam() {
		return heroList;
	}
	
	public Hero getHero(int rank) {
		return heroList[rank];
	}
	
	public void setTeam(Hero[] newTeam) {
		heroList =newTeam;
	}
	
	//Rank must be between 0 and 2
	public void setHero(Hero newHero, int rank) {
		heroList[rank] = newHero;
	}
}

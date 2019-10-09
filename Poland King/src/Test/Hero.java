package Test;

public class Hero {
	private String name;
	private int lvl;
	private double pv;
	private Spell[] spell;
	//Exp exp;
	//Equipment equipment;
	
	
	public Hero() {
		System.out.println("New Hero !");
		lvl = 1;
		name = "[Blank]";
		pv = 500d;
		spell = new Spell[3];
		spell[0] = new Spell();
	}
	
	public Hero(String hName , double hPv, Spell[] hSpell) {
		System.out.println("New Hero !");
		lvl = 1;
		name = hName ;
		pv = hPv ;
		spell = hSpell;
		
	}
	
	// Name
	public String  getName() {
		return name;
	}
	 //Lvl
	
	public int getLvl() {
		return lvl;
	}
	
	public void setLvl(int newLvl) {
		lvl = newLvl;
	}
	
	public void lvlUp() {
		lvl++;
	}
	
	//Pv
	
	public double getPv() {
		return pv;
	}
	
	public void setPv(double newPV) {
		pv = newPV;
		
	}
	
	public void pvSwitch(double amount) {
		pv += amount;
	}
	//Spell
	
	public Spell[] getSpellList() {
		return spell;
	}
	//Rank must be between 0 and 2
	public Spell getSpell(int rank) {
		return spell[rank];
	}
	
	
	public void setSpellList(Spell[] newSpellList) {
		spell = newSpellList ;
	}
	
	//Rank must be between 0 and 2
		public void setSpell(Spell newSpell, int rank) {
			spell[rank] = newSpell;
		}
	
	
	
}




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
	
	public Spell[] getSpell() {
		return spell;
	}
	
	public Spell getSpell1() {
		return spell[0];
	}
	
	public Spell getSpell2() {
		return spell[1];
	}
	
	public Spell getSpell3() {
		return spell[2];
	}
	
	public void setSpell1(Spell[] newSpellList) {
		spell = newSpellList ;
	}
	
	public void setSpell1(Spell newSpell) {
		spell[0] = newSpell;
	}
	
	public void setSpell2(Spell newSpell) {
		spell[1] = newSpell;
	}
	
	public void setSpell3(Spell newSpell) {
		spell[2] = newSpell;
	}
	
	
}




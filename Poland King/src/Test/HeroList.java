package Test;

public class HeroList {
	
//Tarzan	
	public Hero Tarzan() {
		SpellSets lol = new SpellSets();
		
		Hero tarzan = new Hero("Tarzan",650d,lol.tarzanSpellSet());
		
		return tarzan;
		
	}

//Lucas
	public Hero Lucas() {
SpellSets lol = new SpellSets();
		
		Hero lucas = new Hero("Lucas",650d,lol.lucasSpellSet());
		
		return lucas;
		
	}
	
//Mr Sausage
	public Hero MrSausage() {
SpellSets lol = new SpellSets();
		
		Hero mrSausage = new Hero("Mr Sausage",650d,lol.lucasSpellSet());
		
		return mrSausage;
		
	}

}

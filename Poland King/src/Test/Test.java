package Test;

public class Test {
	public static void main(String[] args) {
		
		Team team = new Team();
		System.out.println(team.name);
		team.heroList[0]= new Hero();
		System.out.println(team.heroList[0].lvl);
		System.out.println(team.heroList[0].name);
		System.out.println(team.heroList[0].pv);
		System.out.println(team.heroList[0].spell.name);
		System.out.println(team.heroList[0].spell.description);
	}

}

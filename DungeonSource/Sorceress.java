
public class Sorceress extends Hero{
	
	public final int MIN_ADD = 25;
	public final int MAX_ADD = 50;

	public Sorceress(){
		
		super("Sorceress", 75, 5, .7, 25, 50, .3);
	}

	public void specialAttack(DungeonCharacter opponent){
		
	    int hPoints;
		hPoints = (int)(Math.random() * (MAX_ADD - MIN_ADD + 1)) + MIN_ADD;
		addHitPoints(hPoints);
		System.out.println(name + " added [" + hPoints + "] points.\n"+ "Total hit points remaining are: "+ hitPoints);
		System.out.println();
    }

	public void attack(DungeonCharacter opponent){
		
		System.out.println(name + " casts a spell of fireball at " +opponent.getName() + ":");
		super.attack(opponent);
	}
}

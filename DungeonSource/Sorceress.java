
public class Sorceress extends Hero{
	
	public final int MIN_ADD = 25;
	public final int MAX_ADD = 50;

	public Sorceress(){
		
		super("Sorceress", 75, 5, .7, 25, 50, .3);
	}
	public void attack(DungeonCharacter opponent){
		
		System.out.println(name + " casts a spell of fireball at " +opponent.getName() + ":");
		super.attack(opponent);
	}
}

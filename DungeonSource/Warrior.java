
public class Warrior extends Hero{
	
    public Warrior(){

		super("Warrior", 125, 4, .8, 35, 60, .2, new CrushingBlow());
    }

	public void attack(DungeonCharacter opponent){
		
		System.out.println(name + " swings a mighty sword at " + opponent.getName() + ":");
		super.attack(opponent);
	}
}


public class Thief extends Hero{
	
    public Thief(){
    	
		super("Thief", 75, 6, .8, 20, 40, .5);
    }

	public void specialAttack(DungeonCharacter opponent){
		
		double surprise = Math.random();
		if (surprise <= .4){
			System.out.println("Surprise attack was successful!\n" +name + " gets an additional turn.");
			numTurns++;
			attack(opponent);
		}else if (surprise >= .9){
			System.out.println("Uh oh! " + opponent.getName() + " saw you and" +" blocked your attack!");
		}else
		    attack(opponent);
	}
}

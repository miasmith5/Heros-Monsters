
public abstract class Hero extends DungeonCharacter{
	
	protected double chanceToBlock;
	protected int numTurns;
	
	public Hero(String name, int hitPoints, int attackSpeed, double chanceToHit,
			    int damageMin, int damageMax, double chanceToBlock){
		
		super(name, hitPoints, attackSpeed, chanceToHit, damageMin, damageMax);
		this.chanceToBlock = chanceToBlock;
		readName();
	}

	public void readName(){
		
		System.out.print("Enter character name: ");
		name = Keyboard.readString();
	}

	public boolean defend(){
		
		return Math.random() <= chanceToBlock;
	}
	
	public void subtractHitPoints(int hitPoints){
		
		if (defend())
			System.out.println(name + " BLOCKED the attack!");
		else
			super.subtractHitPoints(hitPoints);
	}

	public void battleChoices(DungeonCharacter opponent){
		
	    numTurns = attackSpeed/opponent.getAttackSpeed();
		if (numTurns == 0)
			numTurns++;
		System.out.println("Number of turns this round is: " + numTurns);
		int choice;
		do{
		    System.out.println("1. Attack Opponent");
		    System.out.println("2. Special Attack");
		    System.out.print("Choose an option: ");
		    choice = Keyboard.readInt();
		    switch (choice){
			    case 1: attack(opponent);
			        break;
			    case 2: specialAttack(opponent);
			        break;
			    default:
			        System.out.println("invalid choice!");
		    }
			numTurns--;
			if (numTurns > 0)
			    System.out.println("Number of turns remaining is: " + numTurns);
		} while(numTurns > 0);

	}

	protected abstract void specialAttack(DungeonCharacter opponent);
}

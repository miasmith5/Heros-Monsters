
public class Thief extends Hero{
	
    public Thief(){
    	
		super("Thief", 75, 6, .8, 20, 40, .5);
    }

<<<<<<< HEAD


    }//end constructor
	@Override
	public void specialAttack(DungeonCharacter opponent)
	{
=======
	public void specialAttack(DungeonCharacter opponent){
		
>>>>>>> f63a3c912d97597da9f26c055086f7f3fe8a72b5
		double surprise = Math.random();
		if (surprise <= .4){
			System.out.println("Surprise attack was successful!\n" +name + " gets an additional turn.");
			numTurns++;
			attack(opponent);
		}else if (surprise >= .9){
			System.out.println("Uh oh! " + opponent.getName() + " saw you and" +" blocked your attack!");
		}else
		    attack(opponent);
<<<<<<< HEAD


	}//end surpriseAttack method


/*    public void battleChoices(DungeonCharacter opponent)
	{
		super.battleChoices(opponent);
		int choice;


		do
		{
		    System.out.println("1. Attack Opponent");
		    System.out.println("2. Surprise Attack");
		    System.out.print("Choose an option: ");
		    choice = Keyboard.readInt();

		    switch (choice)
		    {
			    case 1: attack(opponent);
			        break;
			    case 2: surpriseAttack(opponent);
			        break;
			    default:
			        System.out.println("invalid choice!");
		    }//end switch

			numTurns--;
			if (numTurns > 0)
			    System.out.println("Number of turns remaining is: " + numTurns);

		} while(numTurns > 0);

    }*/
}
=======
	}
}
>>>>>>> f63a3c912d97597da9f26c055086f7f3fe8a72b5

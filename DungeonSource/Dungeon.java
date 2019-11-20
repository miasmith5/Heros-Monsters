<<<<<<< HEAD
import java.util.Scanner;
/*
  This class is the driver file for the Heroes and Monsters project.  It will
  do the following:

  1.  Allow the user to choose a hero
  2.  Randomly select a monster
  3.  Allow the hero to battle the monster

  Once a battle concludes, the user has the option of repeating the above

*/
public class Dungeon
{
	private static Scanner kb = new Scanner(System.in);
    public static void main(String[] args)
	{
=======
>>>>>>> f63a3c912d97597da9f26c055086f7f3fe8a72b5

public class Dungeon{
	
    public static void main(String[] args){
    	
		Hero theHero;
		Monster theMonster;
		do{
		    theHero = chooseHero();
		    theMonster = generateMonster();
			battle(theHero, theMonster);
		} while (playAgain());
    }
    
    public static Hero chooseHero(){
    	
		int choice;
<<<<<<< HEAD
		Hero theHero;

		System.out.println("Choose a hero:\n" +
					       "1. Warrior\n" +
						   "2. Sorceress\n" +
						   "3. Thief");
		choice = kb.nextInt();

		switch(choice)
		{
=======
		System.out.println("Choose a hero:\n" +"1. Warrior\n" +"2. Sorceress\n" +"3. Thief");
		choice = Keyboard.readInt();
		switch(choice){
>>>>>>> f63a3c912d97597da9f26c055086f7f3fe8a72b5
			case 1: return new Warrior();
			case 2: return new Sorceress();
			case 3: return new Thief();
			default: System.out.println("invalid choice, returning Thief");
				     return new Thief();
		}
	}

    public static Monster generateMonster(){
    	
		int choice;
		choice = (int)(Math.random() * 3) + 1;
		switch(choice){
			case 1: return new Monster("The Black Night", 200, 2, .6, .1, 30, 50, 30, 50);
			case 2: return new Monster("Tom The Echanter", 70, 5, .8, .4, 15, 30, 20, 40);
			case 3: return new Monster("The French Taunters", 100, 3, .8, .3, 30, 50, 30, 50);
			default: System.out.println("invalid choice, returning The French Taunters");
				     return new Monster("French Taunters", 100, 3, .8, .3, 30, 50, 30, 50);
		}
	}

    public static boolean playAgain(){
    	
		char again;
		System.out.println("Play again (y/n)?");
<<<<<<< HEAD
		again = kb.nextChar();

=======
		again = Keyboard.readChar();
>>>>>>> f63a3c912d97597da9f26c055086f7f3fe8a72b5
		return (again == 'Y' || again == 'y');
	}

    public static void battle(Hero theHero, Monster theMonster){
    	
		char pause = 'p';
		System.out.println(theHero.getName() + " battles " +theMonster.getName());
		System.out.println("---------------------------------------------");
		while (theHero.isAlive() && theMonster.isAlive() && pause != 'q'){
			theHero.battleChoices(theMonster);
			if (theMonster.isAlive())
			    theMonster.attack(theHero);
			System.out.print("\n-->q to quit, anything else to continue: ");
<<<<<<< HEAD
			pause = kb.nextChar();

		}//end battle loop

=======
			pause = Keyboard.readChar();
		}
>>>>>>> f63a3c912d97597da9f26c055086f7f3fe8a72b5
		if (!theMonster.isAlive())
		    System.out.println(theHero.getName() + " was victorious!");
		else if (!theHero.isAlive())
			System.out.println(theHero.getName() + " was defeated :-(");
		else
			System.out.println("Quitters never win ;-)");
	}
}

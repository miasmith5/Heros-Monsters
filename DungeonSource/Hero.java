<<<<<<< HEAD
import java.util.Scanner;

/**
 * Title: Hero.java
 *
 * Description: Abstract base class for a hierarchy of heroes.  It is derived
 *  from DungeonCharacter.  A Hero has battle choices: regular attack and a
 *  special skill which is defined by the classes derived from Hero.
 *
 *  class variables (all are directly accessible from derived classes):
 *    chanceToBlock -- a hero has a chance to block an opponents attack
 *    numTurns -- if a hero is faster than opponent, their is a possibility
 *                for more than one attack per round of battle
 *
 *  class methods (all are public):
 *    public Hero(String name, int hitPoints, int attackSpeed,
				     double chanceToHit, int damageMin, int damageMax,
					 double chanceToBlock)
	  public void readName()
	  public boolean defend()
	  public void subtractHitPoints(int hitPoints)
	  public void battleChoices(DungeonCharacter opponent)

 * Copyright:    Copyright (c) 2001
 * Company:
 * @author
 * @version 1.0
 */
private Scanner kb;

public abstract class Hero extends DungeonCharacter
{
	protected double chanceToBlock;
	protected int numTurns;

//-----------------------------------------------------------------
//calls base constructor and gets name of hero from user
  public Hero(String name, int hitPoints, int attackSpeed,
				     double chanceToHit, int damageMin, int damageMax,
					 double chanceToBlock)
  {
	super(name, hitPoints, attackSpeed, chanceToHit, damageMin, damageMax);
	this.chanceToBlock = chanceToBlock;
	readName();
  }

/*-------------------------------------------------------
readName obtains a name for the hero from the user
---------------------------------------------------------*/
  public void readName()
  {
		System.out.print("Enter character name: ");
		name = kb.nextLine();
  }//end readName method

/*-------------------------------------------------------
defend determines if hero blocks attack

Receives: nothing
Returns: true if attack is blocked, false otherwise
---------------------------------------------------------*/
  public boolean defend()
  {
		return Math.random() <= chanceToBlock;

  }//end defend method

/*-------------------------------------------------------
subtractHitPoints checks to see if hero blocked attack, if so a message
is displayed, otherwise base version of this method is invoked to
perform the subtraction operation.  This method overrides the method
inherited from DungeonCharacter promoting polymorphic behavior
---------------------------------------------------------*/
public void subtractHitPoints(int hitPoints)
	{
=======

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
		
>>>>>>> f63a3c912d97597da9f26c055086f7f3fe8a72b5
		if (defend())
			System.out.println(name + " BLOCKED the attack!");
		else
			super.subtractHitPoints(hitPoints);
<<<<<<< HEAD
		}


	}//end method

/*-------------------------------------------------------
battleChoices will be overridden in derived classes.  It computes the
number of turns a hero will get per round based on the opponent that is
being fought.  The number of turns is reported to the user.  This stuff might
go better in another method that is invoked from this one...
---------------------------------------------------------*/
	public void battleChoices(DungeonCharacter opponent)
	{
=======
	}

	public void battleChoices(DungeonCharacter opponent){
		
>>>>>>> f63a3c912d97597da9f26c055086f7f3fe8a72b5
	    numTurns = attackSpeed/opponent.getAttackSpeed();
		if (numTurns == 0)
			numTurns++;
		System.out.println("Number of turns this round is: " + numTurns);
		int choice;
<<<<<<< HEAD
		do
		{
		    System.out.println("1. Attack Opponent");
		    System.out.println("2. Special Attack");
		    System.out.print("Choose an option: ");
		    choice = kb.nextInt();

		    switch (choice)
		    {
=======
		do{
		    System.out.println("1. Attack Opponent");
		    System.out.println("2. Special Attack");
		    System.out.print("Choose an option: ");
		    choice = Keyboard.readInt();
		    switch (choice){
>>>>>>> f63a3c912d97597da9f26c055086f7f3fe8a72b5
			    case 1: attack(opponent);
			        break;
			    case 2: specialAttack(opponent);
			        break;
			    default:
			        System.out.println("invalid choice!");
<<<<<<< HEAD
		    }//end switch

			numTurns--;
			if (numTurns > 0)
			    System.out.println("Number of turns remaining is: " + numTurns);

		} while(numTurns > 0);

	}//end battleChoices
	public void specialAttack(DungeonCharacter opponent){

	}

}//end Hero class
=======
		    }
			numTurns--;
			if (numTurns > 0)
			    System.out.println("Number of turns remaining is: " + numTurns);
		} while(numTurns > 0);

	}

	protected abstract void specialAttack(DungeonCharacter opponent);
}
>>>>>>> f63a3c912d97597da9f26c055086f7f3fe8a72b5
